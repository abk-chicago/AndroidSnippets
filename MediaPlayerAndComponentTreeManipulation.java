public class MediaPlayerAndComponentTreeManipulation extends AppCompatActivity {

    private Integer inc = 5;
    private Handler handler;
    private ImageView img;
    private RelativeLayout rl;
    //TypedArray images;
    MediaPlayer mediaPlayer;
    ArrayList<Integer> images = new ArrayList<Integer>();

    protected void onCreate(Bundle savedInstanceState) {

        //images = getResources().obtainTypedArray(R.array.random_imgs);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl = (RelativeLayout) findViewById(R.id.main_relativelayout);

        images.add(R.id.some_img_1);
        images.add(R.id.some_img_2);
        images.add(R.id.some_img_3);
        images.add(R.id.some_img_4);
        images.add(R.id.some_img_5);
        images.add(R.id.some_img_6);

        handler = new Handler();
        mediaPlayer = MediaPlayer.create(this, R.raw.madgar);
        mediaPlayer.start();

        Runnable task = new Runnable() {
            public void run() {
                Log.i("loop image", inc.toString());
                img = (ImageView) findViewById(images.get(inc));
                rl.removeView(img);
                inc--;
                if (inc < 0) {
                    moveTaskToBack(true);
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                }
                handler.postDelayed(this, 2700);
            }
        };
        handler.postDelayed(task, 2700);

    }

}
