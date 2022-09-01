package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gtz  reason: default package */
/* loaded from: classes.dex */
public abstract class gtz implements gub {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/alertdialog/AbstractAlertDialogBuilder");
    protected final int b;
    private IBinder e;
    private float j;
    private hst l;
    private irm m;
    private BroadcastReceiver n;
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;
    private boolean i = true;
    private Boolean k = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public gtz(int i) {
        this.b = i;
    }

    public final Dialog a(final String str, final boolean z) {
        if (!gui.d(str)) {
            throw new IllegalStateException("Alert dialog lifecycle listener not found for ".concat(String.valueOf(str)));
        }
        ijl.b().g(new gui(str, 1, this, null, null, null));
        final Dialog b = b();
        Window window = b.getWindow();
        IBinder iBinder = this.e;
        if (window != null && iBinder != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.token = iBinder;
            attributes.type = 1003;
            window.setAttributes(attributes);
            if (!this.f) {
                window.addFlags(8);
            }
            float f = this.j;
            if (f > 0.0f) {
                window.setDimAmount(f);
                window.addFlags(2);
            }
            if (this.g) {
                window.addFlags(131072);
            }
        }
        Boolean bool = this.k;
        if (bool != null) {
            b.setCanceledOnTouchOutside(bool.booleanValue());
        }
        if (!gwc.i(b.getContext())) {
            fqa fqaVar = new fqa(b, 17);
            if (this.i) {
                gtw gtwVar = new gtw(fqaVar);
                this.l = gtwVar;
                gtwVar.f(mjl.a);
            } else {
                gtx gtxVar = new gtx(fqaVar);
                this.m = gtxVar;
                gtxVar.f(gyc.b);
            }
        }
        if (this.h) {
            this.n = new gty(b);
            b.getContext().registerReceiver(this.n, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        gui.c(2, str, b);
        b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: gts
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                gtz gtzVar = gtz.this;
                Dialog dialog = b;
                boolean z2 = z;
                String str2 = str;
                gtzVar.e(dialog);
                TextView textView = (TextView) dialog.findViewById(16908299);
                if (textView != null) {
                    CharSequence text = textView.getText();
                    ClickableSpan[] clickableSpanArr = text instanceof SpannedString ? (ClickableSpan[]) ((SpannedString) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                    if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    textView.setClickable(false);
                    textView.setLongClickable(false);
                }
                if (!z2) {
                    int a2 = jav.c(dialog.getContext()).a();
                    Window window2 = dialog.getWindow();
                    if (window2 != null && dialog.isShowing()) {
                        jdy.f(new jcv(a2, 1), window2.getDecorView());
                    }
                }
                gui.c(3, str2, dialog);
            }
        });
        if (!z) {
            b.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: gtt
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    gui.b(str, b);
                }
            });
            b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: gtu
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    gtz.this.d(str, b);
                }
            });
        }
        b.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: gtv
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                ijl.b().g(new gui(str, 6, null, b, new guw(), null));
                return false;
            }
        });
        return b;
    }

    protected abstract Dialog b();

    @Override // defpackage.gub
    public final /* synthetic */ gub c(int i) {
        Drawable a2 = ur.a(r(), i);
        if (a2 != null) {
            o(a2);
        } else {
            w(i);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, Dialog dialog) {
        hst hstVar = this.l;
        if (hstVar != null) {
            hstVar.h();
            this.l = null;
        }
        irm irmVar = this.m;
        if (irmVar != null) {
            irmVar.h();
            this.m = null;
        }
        if (this.n != null) {
            dialog.getContext().unregisterReceiver(this.n);
            this.n = null;
        }
        gui.c(5, str, dialog);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(Dialog dialog) {
    }

    public final void f(String str) {
        Activity activity = (Activity) gwc.b(r(), Activity.class);
        if (activity != null) {
            g(str, activity);
            return;
        }
        hsk b = hsx.b();
        IBinder F = b != null ? b.F() : null;
        this.e = F;
        boolean z = false;
        if (F == null) {
            ltd ltdVar = (ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/alertdialog/AbstractAlertDialogBuilder", "showDialog", 202, "AbstractAlertDialogBuilder.java");
            if (b == null) {
                z = true;
            }
            ltdVar.w("null window token, service is null: %s", Boolean.valueOf(z));
            return;
        }
        a(str, false).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(String str, Activity activity) {
        gue gueVar = new gue();
        gueVar.a = new gug(str, this.b);
        gueVar.show(activity.getFragmentManager(), "");
    }

    @Override // defpackage.gub
    public final void h() {
        this.g = true;
    }

    @Override // defpackage.gub
    public final void i() {
        this.j = 0.5f;
    }

    @Override // defpackage.gub
    public final void j() {
        this.h = true;
    }

    @Override // defpackage.gub
    public final void k() {
        this.i = false;
    }

    @Override // defpackage.gub
    public final void l() {
        this.f = true;
    }

    @Override // defpackage.gub
    public final /* synthetic */ void m(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        if (i == -3) {
            B(i2, onClickListener);
        } else if (i != -2) {
            C(i2, onClickListener);
        } else {
            t(i2, onClickListener);
        }
    }

    @Override // defpackage.gub
    public final void n(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.gub
    public final /* synthetic */ void o(Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            x(drawable);
            return;
        }
        TypedValue typedValue = new TypedValue();
        r().getTheme().resolveAttribute(R.attr.f9790_resource_name_obfuscated_res_0x7f040340, typedValue, true);
        Drawable newDrawable = constantState.newDrawable();
        wf.f(newDrawable, typedValue.data);
        x(newDrawable);
    }

    @Override // defpackage.gub
    public final /* synthetic */ void p(ijk ijkVar) {
        y(ijkVar.k(), new ees(ijkVar.l(), 9));
    }

    @Override // defpackage.gub
    public final /* synthetic */ void q(ijk ijkVar) {
        u(new jdz(r(), R.layout.f144790_resource_name_obfuscated_res_0x7f0e0506, ijkVar.k()), new ees(ijkVar.l(), 10));
    }
}
