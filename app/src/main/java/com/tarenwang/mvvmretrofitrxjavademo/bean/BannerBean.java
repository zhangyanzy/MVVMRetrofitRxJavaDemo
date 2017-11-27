package com.tarenwang.mvvmretrofitrxjavademo.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/11/24.
 */

public class BannerBean {

    /**
     * date : 20171124
     * stories : [{"images":["https://pic2.zhimg.com/v2-0da07c833f15a8a81aca42c8f4bd4b6d.jpg"],"type":0,"id":9656588,"ga_prefix":"112411","title":"找到你耳朵上那个小孔了吗？那是你祖先留下的痕迹"},{"images":["https://pic3.zhimg.com/v2-0d0af51b0fca0ce0ef111f8ff3f81532.jpg"],"type":0,"id":9657919,"ga_prefix":"112410","title":"改掉这些毛病，本土小城也能和欧洲小镇一样干干净净"},{"images":["https://pic2.zhimg.com/v2-f0a30ee3a9406fb60cc268381aee8719.jpg"],"type":0,"id":9658048,"ga_prefix":"112409","title":"从耳机里就能听出友军的方位，这些游戏是怎么做到的？"},{"images":["https://pic1.zhimg.com/v2-87a67879256ce78300c9e31e2317f03c.jpg"],"type":0,"id":9658066,"ga_prefix":"112408","title":"为什么大脑压力变大后，会像喷射一样呕吐？"},{"images":["https://pic3.zhimg.com/v2-959a07c3636f1e063837aa0f0cc09a6a.jpg"],"type":0,"id":9657414,"ga_prefix":"112407","title":"在追求、恋爱和婚姻中，有哪些残酷的规律？"},{"images":["https://pic2.zhimg.com/v2-1aec9c3a1f9f2d793533e1c4b5ea2dc1.jpg"],"type":0,"id":9658099,"ga_prefix":"112407","title":"你「吃鸡」时飙的车，到底是什么车？"},{"images":["https://pic2.zhimg.com/v2-abff5d4b8cae2c73c1902e3699acc419.jpg"],"type":0,"id":9656627,"ga_prefix":"112407","title":"直到伤害完孩子之时，他们也还在相信自己是个好的教育者"},{"images":["https://pic2.zhimg.com/v2-2f7b6afb6b6322f5194a822c56a1657d.jpg"],"type":0,"id":9658157,"ga_prefix":"112406","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic3.zhimg.com/v2-10c50d99c1c5628ab8254d5f15f8229e.jpg","type":0,"id":9658099,"ga_prefix":"112407","title":"你「吃鸡」时飙的车，到底是什么车？"},{"image":"https://pic1.zhimg.com/v2-e385443ea8fbfe9beeb54d7baba7a2f4.jpg","type":0,"id":9657861,"ga_prefix":"112307","title":"- 快递若当天不领，原路退回\r\n- 你敢？"},{"image":"https://pic2.zhimg.com/v2-da3698e6bb4da819ebff07d2e037ae2d.jpg","type":0,"id":9658037,"ga_prefix":"112307","title":"有哪些对犯罪心理学影响深远的案件？"},{"image":"https://pic1.zhimg.com/v2-24318d8469a0821a63048f52a6824174.jpg","type":0,"id":9657724,"ga_prefix":"112309","title":"交出了身体的女孩"},{"image":"https://pic4.zhimg.com/v2-b345e2b53e2e971f97988f269c3f8fef.jpg","type":0,"id":9658000,"ga_prefix":"112307","title":"趣店百万学生数据疑似外泄，如果属实，那可真是太糟了"}]
     */

    private String date;
    /**
     * images : ["https://pic2.zhimg.com/v2-0da07c833f15a8a81aca42c8f4bd4b6d.jpg"]
     * type : 0
     * id : 9656588
     * ga_prefix : 112411
     * title : 找到你耳朵上那个小孔了吗？那是你祖先留下的痕迹
     */

    private List<StoriesBean> stories;
    /**
     * image : https://pic3.zhimg.com/v2-10c50d99c1c5628ab8254d5f15f8229e.jpg
     * type : 0
     * id : 9658099
     * ga_prefix : 112407
     * title : 你「吃鸡」时飙的车，到底是什么车？
     */

    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "StoriesBean{" +
                    "type=" + type +
                    ", id=" + id +
                    ", ga_prefix='" + ga_prefix + '\'' +
                    ", title='" + title + '\'' +
                    ", images=" + images +
                    '}';
        }
    }

    public static class TopStoriesBean {
        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    @Override
    public String toString() {
        return "BannerBean{" +
                "date='" + date + '\'' +
                ", stories=" + stories +
                ", top_stories=" + top_stories +
                '}';
    }
}


