/**
 * Created by avalo on 16.08.2016.
 */
public class Loader {

    public static String text = "Learn About Java Technology\n" +
            "Java is the foundation for virtually every type of networked application and is the global standard for developing and delivering embedded and mobile applications, games, Web-based content, and enterprise software. With more than 9 million developers worldwide, Java enables you to efficiently develop, deploy and use exciting applications and services.\n" +
            "\n" +
            "From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet, Java is everywhere!\n" +
            "\n" +
            "Java logo\n" +
            "97% of Enterprise Desktops Run Java\n" +
            "89% of Desktops (or Computers) in the U.S. Run Java\n" +
            "9 Million Java Developers Worldwide\n" +
            "#1 Choice for Developers\n" +
            "#1 Development Platform\n" +
            "3 Billion Mobile Phones Run Java\n" +
            "100% of Blu-ray Disc Players Ship with Java\n" +
            "5 Billion Java Cards in Use\n" +
            "125 million TV devices run Java\n" +
            "5 of the Top 5 Original Equipment Manufacturers Ship Java ME\n" +
            "\n" +
            "Why Software Developers Choose Java\n" +
            "Java has been tested, refined, extended, and proven by a dedicated community of Java developers, architects and enthusiasts. Java is designed to enable development of portable, high-performance applications for the widest range of computing platforms possible. By making applications available across heterogeneous environments, businesses can provide more services and boost end-user productivity, communication, and collaboration—and dramatically reduce the cost of ownership of both enterprise and consumer applications. Java has become invaluable to developers by enabling them to:\n" +
            "\n" +
            "Write software on one platform and run it on virtually any other platform\n" +
            "Create programs that can run within a web browser and access available web services\n" +
            "Develop server-side applications for online forums, stores, polls, HTML forms processing, and more\n" +
            "Combine applications or services using the Java language to create highly customized applications or services\n" +
            "Write powerful and efficient applications for mobile phones, remote processors, microcontrollers, wireless modules, sensors, gateways, consumer products, and practically any other electronic device\n" +
            "Some Ways Software Developers Learn Java\n" +
            "Register for JavaOne Many colleges and universities offer courses in programming for the Java platform. The Oracle Academy provides a complete portfolio of software, curriculum, hosted technology, faculty training, support, and certification resources to K-12, vocational, and higher education institutions for teaching use, including a Java offering that will support hundreds of thousands of students. In addition, developers can also enhance their Java programming skills by reading the Oracle Java developer web site, subscribing to Java technology-focused newsletters and Java Magazine, using the Java Tutorial and the New to Java Programming Center, and signing up for Web, virtual, or instructor-led courses and certification.\n" +
            "\n" +
            "OTN logo The Oracle Technology Network is the world's largest community of application developers, database administrators, system admins/developers, and architects using industry-standard technologies in combination with Oracle products. It is also the home of java.oracle.com , the ultimate, complete, and authoritative source of technical information about Java. Membership is free, join today! (In your Profile, check the Oracle Technology Network box under My Community Memberships.)\n" +
            "\n" +
            "Young Developers Learn Java\n" +
            "Young people are learning programming languages from the earliest ages and up. Visual educational tools such as Alice, Greenfoot and BlueJ tools teach young people how to program using the Java programming language, and Java-based languages developed for ease of use.\n" +
            "\n";
    public static void main(String[] args) {

        String arrayText[] = text.split("\\p{P}?[ \\t\\n\\r]+");
        System.out.println(arrayText.length);
        for (int i = 0; i < arrayText.length; i++) {
            System.out.println(arrayText[i]);
        }
    }
}
