package com.bwie.litaiqin20161121;

import java.util.List;

/**
 * Created by ${李泰亲} on 2016/11/21.
 */

public class DataBean_1 {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"银行有个光头猥琐大叔一直对出纳姐姐说：\u201c妹子，借我一万块玩玩呗~\u201d 　　那姐姐特无奈地说：\u201c爸，取款就取款，别让别人误会了\u2026\u2026\u201d","hashId":"bcb54b009d97978f1b6f268fcef353a0","unixtime":1479609230,"updatetime":"2016-11-20 10:33:50"},{"content":"妈妈：\u201c看看你的成绩！平时喊你多听听英语，就知道玩。\u201d　　女儿：\u201c多听难道就会说了？\u201d　　妈妈：\u201c当然，我以前就是这样学的。\u201d　　女儿：\u201c那你每天都听到狗叫，知道它说什么吗？\u201d","hashId":"f13fbddb1de5cf060276b03153ad7fd3","unixtime":1479608632,"updatetime":"2016-11-20 10:23:52"},{"content":"A：\u201c去游泳池游泳去。\u201d　　B：\u201c不去，太阳太大，会被晒黑。\u201d　　A：\u201c怕什么？游泳池里有漂白粉！\u201d","hashId":"f8fc30fe841f6c02d1b4a00cdebd5b11","unixtime":1479608632,"updatetime":"2016-11-20 10:23:52"},{"content":"一位老兄让我仔细体会，他多年来反复推敲的一个研究成果：　　\u201c只用一句话来定义什么是大领导？从来没见过堵车的领导，才是真正的大领导。\u201d","hashId":"dffafeb35ae27c29fa7c792d50377983","unixtime":1479608632,"updatetime":"2016-11-20 10:23:52"},{"content":"今天晚上去电影院看了《冰河世纪4》，一只雏鸟问猛犸象：\u201c你们用鼻子喝水的时候，水的味道是不是有鼻屎味儿？\u201d　　这个问题好深奥哦，我怎么没想过这个问题\u2026\u2026","hashId":"597663cbd9dbbc5b88d9c55c74dcc87f","unixtime":1479608632,"updatetime":"2016-11-20 10:23:52"},{"content":" 　　数学课快下了，只剩两道题了。　　老师说：\u201c我做一道，另一道留给你们。你们挑吧！\u201d　　有同学道：\u201c老师，你做难的。\u201d　　老师说：\u201c我做男的，你们做女的啊？","hashId":"6a6e1ccc8fe566862d1791d6e1f5bcd3","unixtime":1479608632,"updatetime":"2016-11-20 10:23:52"},{"content":"问：奥运跳水比赛，跳完水以后为啥每次都要冲一下澡？　　答：那么高，很多选手都吓尿了\u2026\u2026","hashId":"23df01b77b0e006f761a260d37295ce1","unixtime":1479608632,"updatetime":"2016-11-20 10:23:52"},{"content":"某年的某天，到我们当地派出所换二代身份证。人很多，都快排到派出所旁边的化肥厂门口了。　　肚子也不争气咕噜咕噜一直响，一个接一个的放屁，那个叫一个臭啊！我都不好意思在那里站了。　　身后有个大妈说：\u201c这些派出所的警察孩子们办公不容易啊！天天闻着化肥厂的臭气会伤身体的！\u201d","hashId":"392aa72e73be4ecf26e1579279d5deaa","unixtime":1479608632,"updatetime":"2016-11-20 10:23:52"},{"content":"同事告诉我她买了部汽车，于是我问她：\u201c什么车？\u201d　　她：\u201c汽车呀。\u201d　　我：\u201c我是问你什么牌子！\u201d　　她：\u201c牌子还没上呢！\u201d　　好吧，我放弃沟通了\u2026\u2026","hashId":"ed9be4ce4a35eea5ce7869454468434c","unixtime":1479608632,"updatetime":"2016-11-20 10:23:52"},{"content":"    课上，老师问小朋友们：\u201c你们知道谁是英雄吗？\u201d这时，小刚怯怯的站起来，小声的说：\u201c我爸爸是英雄。\u201d他一说完，大家都笑了，因为他们认为他爸爸怎么可能是英雄。老师也有点诧异，问小刚：\u201c为什么呀？\u201d\u201c因为我妈妈说汶川地震的时候他为了救我们全村人，去了很远的地方\u201d。","hashId":"f8f654bd7c414c6ec85ecddc2b13fd1a","unixtime":1479608632,"updatetime":"2016-11-20 10:23:52"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : 银行有个光头猥琐大叔一直对出纳姐姐说：“妹子，借我一万块玩玩呗~” 　　那姐姐特无奈地说：“爸，取款就取款，别让别人误会了……”
             * hashId : bcb54b009d97978f1b6f268fcef353a0
             * unixtime : 1479609230
             * updatetime : 2016-11-20 10:33:50
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }
        }
    }
}
