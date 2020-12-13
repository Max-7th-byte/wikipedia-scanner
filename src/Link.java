public class Link {
    String link, tag, innerText;
    Link(String link, String tag, String innerText) {
        this.link = link;
        this.tag = tag;
        this.innerText = innerText;
    }


    @Override
    public String toString() {
        return "Link{" +
                "link='" + link + '\'' +
                ", tag='" + tag + '\'' +
                ", innerText='" + innerText + '\'' +
                '}';
    }
}
