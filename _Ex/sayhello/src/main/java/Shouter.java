import android.content.Context;
import android.widget.Toast;

public class Shouter {

    private Context _context;

    public Shouter(Context context){
        _context = context;
    }

    public void ShoutHello(){
        Toast.makeText(_context,"Put here the toast of Java Lib soon",Toast.LENGTH_SHORT).show();
    }
}
