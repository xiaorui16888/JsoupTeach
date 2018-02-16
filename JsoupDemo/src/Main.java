
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import java.io.IOException;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
public class Main
{
    public static void main(String[] wen)
    {
        try
        {   //解析小刀娱乐网的HTML字符串
            Document document = Jsoup.connect("http://www.xiaodao.la/i_wz.asp?id=783242&fl_id=37227195&PageIndex=1").get();
            //打印HTML字符串
            System.out.println(document);
            //解析指定段落中的内容   注意： 此代码中的语法：<div class=post-header>
            Elements element =document.getElementsByClass("post-header");
            //声明一个变量   备注： 因为要解析的HTML中，有多个：<div class=post-header>
            int i = 0;
            //element.size是用来计算有多少个 <div class=post-header>
            for (i = 0;i < element.size();i++)
            {
                //从<div class=post-header>中，循环查找a标签中的第一个元素，取得字符串的文本。
                System.out.println(element.get(i).select("a").first().text());
            }
        }
        catch (IOException e)
        {}
    }
}

