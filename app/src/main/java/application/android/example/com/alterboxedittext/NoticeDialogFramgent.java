package application.android.example.com.alterboxedittext;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class NoticeDialogFramgent extends Dialog implements View.OnClickListener{
    public Activity ctx;
    public Dialog dia;
    public Button yes,no;
    public EditText edi;

    public NoticeDialogFramgent(Activity context) {
        super(context);
        this.ctx=context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.alert);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        edi=findViewById(R.id.love);

        yes.setOnClickListener(this);
        no.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.yes:

                ctx.finish();
                break;
            case  R.id.no:
                Global.name=edi.getText().toString();
                dismiss();
                break;
        }
        dismiss();
    }
}
