package com.zzia.wngn.design.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 23:03
 * @email wanggang@vfou.com
 * @descripe <p/>
 * 意图：<br>
 * 将对象组合成树形结构以表示“部分-整体”的层次结构。Composite使得用户对单个对象和组合对象的使用具有一致性。<br>
 * <p/>
 * 优点<br>
 * 1、可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，使得增加新构件也更容易。<br>
 * 2、客户端调用简单，客户端可以一致的使用组合结构或其中单个对象。<br>
 * 3、定义了包含叶子对象和容器对象的类层次结构，叶子对象可以被组合成更复杂的容器对象，而这个容器对象又可以被组合，
 * 这样不断递归下去，可以形成复杂的树形结构。<br>
 * 4、更容易在组合体内加入对象构件，客户端不必因为加入了新的对象构件而更改原有代码。<br>
 * <p/>
 * 缺点<br>
 * 1、使设计变得更加抽象，对象的业务规则如果很复杂，则实现组合模式具有很大挑战性，而且不是所有的方法都与叶子对象子类都有关联<br>
 * <p/>
 * 模式适用场景<br>
 * 1、需要表示一个对象整体或部分层次，在具有整体和部分的层次结构中，希望通过一种方式忽略整体与部分的差异，可以一致地对待它们。<br>
 * 2、让客户能够忽略不同对象层次的变化，客户端可以针对抽象构件编程，无须关心对象层次结构的细节。<br>
 * <p/>
 * 模式总结<br>
 * 1、 组合模式用于将多个对象组合成树形结构以表示“整体-部分”的结构层次。组合模式对单个对象（叶子对象）和组合对象（容器对象）的使用具有一致性。<br>
 * 2、 组合对象的关键在于它定义了一个抽象构建类，它既可表示叶子对象，也可表示容器对象，客户仅仅需要针对这个抽象构建进行编程，
 * 无须知道他是叶子对象还是容器对象，都是一致对待。<br>
 * 3、 组合模式虽然能够非常好地处理层次结构，也使得客户端程序变得简单，但是它也使得设计变得更加抽象，而且也很难对容器中的构件类型进行限制，
 * 这会导致在增加新的构件时会产生一些问题。<br>
 */
public class CompositeMain {

    private static Logger logger = LoggerFactory.getLogger(Folder.class);

    public static void main(String[] args) {
        //总文件夹
        Folder zwjj = new Folder("总文件夹");
        //向总文件夹中放入三个文件：1.txt、2.jpg、1文件夹
        TextFile aText = new TextFile("a.txt");
        ImageFile bImager = new ImageFile("b.jpg");
        Folder cFolder = new Folder("C文件夹");

        zwjj.add(aText);
        zwjj.add(bImager);
        zwjj.add(cFolder);

        //向C文件夹中添加文件：c_1.txt、c_1.rmvb、c_1.jpg
        TextFile cText = new TextFile("c_1.txt");
        ImageFile cImage = new ImageFile("c_1.jpg");
        VideoFile cVideo = new VideoFile("c_1.rmvb");

        cFolder.add(cText);
        cFolder.add(cImage);
        cFolder.add(cVideo);

        //遍历C文件夹
        zwjj.display("");
        logger.info("-----------------------");
        cFolder.display();
        //将c_1.txt删除
        cFolder.remove(cText);
        logger.info("-----------------------");
        cFolder.display();
    }
}
