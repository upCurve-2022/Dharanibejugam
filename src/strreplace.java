public class strreplace {
        public static void main(String args[])
        {
            String str = "I am always ready to learn although I do not always like being taught.";
            int size = str.length();
            System.out.println(str);
            String a = null;
            str = str.replace(a, "$");
            System.out.println(str);
        }
    }
