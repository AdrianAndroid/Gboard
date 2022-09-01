package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;

/* compiled from: PG */
/* renamed from: fax  reason: default package */
/* loaded from: classes.dex */
public final class fax extends jct {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationIntroDialog");
    final boolean b;
    public final IBinder c;
    public final int d;
    public final boolean e;
    public Runnable f;
    public guh g;
    public guh h;

    public fax(Context context, IBinder iBinder, int i, boolean z) {
        super(context);
        boolean booleanValue = ((Boolean) fbh.L.c()).booleanValue();
        this.b = booleanValue;
        this.c = iBinder;
        this.d = i;
        this.e = z;
        if (booleanValue) {
            fav favVar = new fav(this);
            this.g = favVar;
            favVar.e();
            faw fawVar = new faw(this);
            this.h = fawVar;
            fawVar.e();
        }
    }

    public static void h(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            fbr.f(window.getDecorView());
        }
    }

    public final void a(mko mkoVar) {
        kcu.U(mkoVar, new eay(this, 10), gyc.b);
    }

    public final void b(final Dialog dialog) {
        final Context context = getContext();
        LinkableTextView linkableTextView = (LinkableTextView) dialog.findViewById(R.id.f130550_resource_name_obfuscated_res_0x7f0b21f2);
        linkableTextView.a = new bwd(context, 6);
        linkableTextView.setClickable(false);
        linkableTextView.setLongClickable(false);
        LinkableTextView linkableTextView2 = (LinkableTextView) dialog.findViewById(R.id.f130560_resource_name_obfuscated_res_0x7f0b21f3);
        linkableTextView2.a = new jdj() { // from class: fau
            @Override // defpackage.jdj
            public final void a(int i) {
                fax faxVar = fax.this;
                Context context2 = context;
                Dialog dialog2 = dialog;
                hsk b = hsx.b();
                if (b != null) {
                    fbf.g(context2, b);
                    if (faxVar.e) {
                        return;
                    }
                    dialog2.dismiss();
                }
            }
        };
        linkableTextView2.setClickable(false);
        linkableTextView2.setLongClickable(false);
    }

    public final void c(ido idoVar) {
        ieh.j().e(idoVar, fbf.a(this.e), 4, Integer.valueOf(fay.a(getContext())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jct, defpackage.dt, defpackage.ox, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f187920_resource_name_obfuscated_res_0x7f14118d);
        setContentView(true != this.e ? R.layout.f147050_resource_name_obfuscated_res_0x7f0e060e : R.layout.f147040_resource_name_obfuscated_res_0x7f0e060d);
        findViewById(R.id.f130630_resource_name_obfuscated_res_0x7f0b21fa).setOnClickListener(new fat(this, 0));
        findViewById(R.id.f130640_resource_name_obfuscated_res_0x7f0b21fb).setOnClickListener(new fat(this, 2));
        findViewById(R.id.f130570_resource_name_obfuscated_res_0x7f0b21f4).setOnClickListener(new fat(this, 3));
        b(this);
        findViewById(R.id.f130580_resource_name_obfuscated_res_0x7f0b21f5).setOnClickListener(new fat(this, 4));
        Window window = getWindow();
        if (window != null) {
            IBinder iBinder = this.c;
            int i = this.d;
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.token = iBinder;
            attributes.width = window.getWindowManager().getDefaultDisplay().getWidth();
            attributes.height = i;
            attributes.type = 1003;
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setAttributes(attributes);
            window.addFlags(131072);
        }
    }

    @Override // defpackage.jct, android.app.Dialog
    public final void show() {
        if (this.b) {
            guc.a.a(getContext(), "IntroDialog");
        } else {
            super.show();
        }
    }
}
