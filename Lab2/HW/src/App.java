public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Homework!");
		Dispacher dispacher = Dispacher.get_instance();



		Subscriber s0 = new LowSubscriber();
		Subscriber s1 = new LowSubscriber();
		Subscriber s2 = new UpperSubscriber();
		Subscriber s3 = new UpperSubscriber();

		s0.Subscribe("Beast in Black"); //This will create the topic
		
		dispacher.send_message("helo", "topic");

		dispacher.add_topic(new Topic("Beast in Black")); // this will be discarded
		dispacher.add_topic(new Topic("Burnout"));
		dispacher.add_topic(new Topic("Equilibrium"));
		dispacher.add_topic(new Topic("Me singing"));



		s0.Subscribe("Beast in Black");// Try to subscribe to the same twice, this will not happen

		s2.Subscribe("Beast in Black");
		s1.Subscribe("Burnout");
		s3.Subscribe("Burnout");
		
		s0.Subscribe("Equilibrium");
		s3.Subscribe("Equilibrium");
		
		s3.Subscribe("Me singing");
		s3.UnSubscribe("Me singing"); //it was an accident


		s0.SendMsg_To_Topic("Listen to Bella Donna!","Beast in Black");
		s1.SendMsg_To_Topic("Ördög a kórusban!","Burnout");
		s2.SendMsg_To_Topic("Snüffel","Equilibrium");
		
		s0.SendMsg_To_Topic("Is anyone here?","Me singing");
		
		
		s1.Subscribe("Beast in Black");
		s3.Subscribe("Beast in Black");

		s0.SendMsg_To_Topic("Listen to Blind and Frozen!","Beast in Black");





    }
}
