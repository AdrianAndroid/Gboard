package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: eyu  reason: default package */
/* loaded from: classes.dex */
public final class eyu extends jct implements eyt {
    public final eyq a;
    public final eyr b;
    private final Context c;
    private final IBinder d;
    private final int e = R.layout.f142750_resource_name_obfuscated_res_0x7f0e041a;
    private final String f;

    public eyu(Context context, IBinder iBinder, int i, Map map, List list, String str, leq leqVar, eyr eyrVar) {
        super(context);
        this.c = context;
        this.d = iBinder;
        this.f = context.getString(i);
        eyq eyqVar = new eyq(context, map, list, str, leqVar);
        this.a = eyqVar;
        this.b = eyrVar;
        eyqVar.f = new emq(this, 13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jct, defpackage.dt, defpackage.ox, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        setContentView(this.e);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.f130210_resource_name_obfuscated_res_0x7f0b21cc);
        if (appCompatTextView != null) {
            appCompatTextView.setText(this.f);
            appCompatTextView.setContentDescription(this.f);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.f130200_resource_name_obfuscated_res_0x7f0b21cb);
        if (recyclerView != null) {
            recyclerView.aa(this.a);
            recyclerView.ab(new LinearLayoutManager(1));
        }
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.token = this.d;
            attributes.type = 1003;
            attributes.dimAmount = 0.32f;
            window.setAttributes(attributes);
            window.addFlags(131072);
            window.setLayout(-1, -2);
            window.setBackgroundDrawableResource(R.drawable.f46210_resource_name_obfuscated_res_0x7f08012e);
        }
    }
}
