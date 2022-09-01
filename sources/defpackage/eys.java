package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.widget.AppCompatTextView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: eys  reason: default package */
/* loaded from: classes.dex */
public final class eys extends Dialog implements eyt {
    public final eyo a;
    public final eyr b;
    private final Context c;
    private final IBinder d;
    private final int e = R.layout.f142740_resource_name_obfuscated_res_0x7f0e0419;
    private final String f;

    public eys(Context context, IBinder iBinder, int i, Map map, List list, String str, eyr eyrVar) {
        super(context);
        this.c = context;
        this.d = iBinder;
        this.f = context.getString(i);
        eyo eyoVar = new eyo(context, map, list, str);
        this.a = eyoVar;
        eyoVar.addAll(map.keySet());
        this.b = eyrVar;
        eyoVar.b = new emq(this, 12);
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        setContentView(this.e);
        ((AppCompatTextView) findViewById(R.id.f130210_resource_name_obfuscated_res_0x7f0b21cc)).setText(this.f);
        ((ListView) findViewById(R.id.f130200_resource_name_obfuscated_res_0x7f0b21cb)).setAdapter((ListAdapter) this.a);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.token = this.d;
            attributes.type = 1003;
            window.setAttributes(attributes);
            window.addFlags(131072);
        }
    }
}
