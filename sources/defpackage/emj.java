package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: emj  reason: default package */
/* loaded from: classes.dex */
public final class emj extends jct {
    final boolean a;
    public final ely b;
    public guh c;
    private final IBinder d;
    private final Runnable e;
    private final int f;
    private final mdx g;

    public emj(Context context, IBinder iBinder, Runnable runnable, ely elyVar, mdx mdxVar, int i) {
        super(context);
        boolean a = gul.a();
        this.a = a;
        this.d = iBinder;
        this.e = runnable;
        this.b = elyVar;
        this.g = mdxVar;
        this.f = i;
        if (a) {
            emi emiVar = new emi(this);
            this.c = emiVar;
            emiVar.e();
        }
    }

    public static void c(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            h(window.getDecorView());
        }
    }

    public static void h(View view) {
        hxk.a(view.getContext()).b(view, 0);
    }

    public final void a() {
        ieh.j().e(emm.SHARING_USAGE, this.g, mdy.CANCEL_CLICKED);
    }

    public final void b() {
        ino.M(getContext()).f("has_user_shared", true);
        ieh.j().e(emm.SHARING_LANGUAGE, this.g, this.b.x());
        this.e.run();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jct, defpackage.dt, defpackage.ox, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        double d;
        double d2;
        super.onCreate(bundle);
        setTitle(R.string.f153070_resource_name_obfuscated_res_0x7f1402be);
        if (mdx.SETTINGS.equals(this.g)) {
            setContentView(R.layout.f134850_resource_name_obfuscated_res_0x7f0e00cb);
        } else {
            setContentView(R.layout.f134840_resource_name_obfuscated_res_0x7f0e00ca);
            hqt b = hqp.b();
            if (b != null) {
                jco.a(this, b.i());
            }
        }
        Window window = getWindow();
        if (window != null) {
            Point point = new Point();
            window.getWindowManager().getDefaultDisplay().getSize(point);
            int i = point.x;
            if (getContext().getResources().getConfiguration().orientation == 1) {
                d = i;
                d2 = 0.78d;
                Double.isNaN(d);
            } else {
                d = i;
                d2 = 0.58d;
                Double.isNaN(d);
            }
            int i2 = (int) (d * d2);
            ((AppCompatTextView) findViewById(R.id.f55890_resource_name_obfuscated_res_0x7f0b023b)).setMaxWidth(i2);
            ((AppCompatTextView) findViewById(R.id.f55830_resource_name_obfuscated_res_0x7f0b0235)).setMaxWidth(i2);
        }
        els.g((RecyclerView) findViewById(R.id.f55840_resource_name_obfuscated_res_0x7f0b0236), this.b);
        findViewById(R.id.f55860_resource_name_obfuscated_res_0x7f0b0238).setOnClickListener(new edc(this, 11));
        findViewById(R.id.f55850_resource_name_obfuscated_res_0x7f0b0237).setOnClickListener(new edc(this, 12));
        gzm.n(getWindow(), this.d, this.f);
    }

    @Override // defpackage.jct, android.app.Dialog
    public final void show() {
        if (this.a) {
            guc.a.a(getContext(), "SharingLinkSendDialog");
        } else {
            super.show();
        }
    }
}
