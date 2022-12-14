package com.example.linebot;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.action.PostbackAction;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TemplateMessage;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.message.template.ConfirmTemplate;
import com.linecorp.bot.model.response.BotApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.scheduling.annotation.Scheduled;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutionException;

@RestController
public class Push {

    private static final Logger log = LoggerFactory.getLogger(Push.class);

    // push先のユーザID（本来は、友達登録をした瞬間にDBなどに格納しておく）
    private String userId = "Uaf5cb9c5f745cb343bd255c306e610fd";

    private final LineMessagingClient client;

    @Autowired
    public Push(LineMessagingClient lineMessagingClient) {
        this.client = lineMessagingClient;
    }

    // ------------ 中略・変更なし ------------

    // 時報をpush
    @GetMapping("timetone")
   // @Scheduled(cron = "0 */1 * * * *",zone = "Asia/Tokyo")//追加
    public String pushTimeTone() {
        String text = DateTimeFormatter.ofPattern("a K:mm").format(LocalDateTime.now());
        try {
            PushMessage pMsg
                    = new PushMessage(userId, new TextMessage(text));
            BotApiResponse resp = client.pushMessage(pMsg).get();
            log.info("Sent messages: {}", resp);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        return text;
    }

    // 確認メッセージをpush
    @GetMapping("confirm")
    public String pushConfirm() {
        String text = "質問だよ";
        try {
            Message msg = new TemplateMessage(text,
                    new ConfirmTemplate("いいかんじ？",
                            new PostbackAction("おけまる", "CY"),
                            new PostbackAction("やばたん", "CN")));
            PushMessage pMsg = new PushMessage(userId, msg);
            BotApiResponse resp = client.pushMessage(pMsg).get();
            log.info("Sent messages: {}", resp);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        return text;
    }



}

