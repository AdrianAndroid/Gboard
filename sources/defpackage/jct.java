package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Window;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: jct  reason: default package */
/* loaded from: classes.dex */
public class jct extends dt {
    public int i;
    public int j;
    public final irm k = new jcs(this);

    public jct(Context context) {
        super(new ContextThemeWrapper(context, (int) R.style.f191800_resource_name_obfuscated_res_0x7f1501f9), 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.ox, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(0);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        Configuration c = irn.c();
        int i = 0;
        this.i = c == null ? 0 : c.orientation;
        if (c != null) {
            i = c.uiMode;
        }
        this.j = i;
        this.k.f(mjl.a);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: jcr
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                jct.this.k.h();
            }
        });
    }
}
