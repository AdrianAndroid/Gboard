package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* renamed from: aic  reason: default package */
/* loaded from: classes.dex */
public abstract class aic extends ai implements DialogInterface.OnClickListener {
    private DialogPreference ac;
    private CharSequence ad;
    private CharSequence ae;
    private CharSequence af;
    public int ag;
    private CharSequence ah;
    private int ai;
    private BitmapDrawable aj;

    @Override // defpackage.ai
    public final Dialog a(Bundle bundle) {
        this.ag = -2;
        cu cuVar = new cu(fT());
        cuVar.k(this.ad);
        cuVar.e(this.aj);
        cuVar.i(this.ae, this);
        CharSequence charSequence = this.af;
        cq cqVar = cuVar.a;
        cqVar.j = charSequence;
        cqVar.k = this;
        fT();
        int i = this.ai;
        View view = null;
        if (i != 0) {
            LayoutInflater layoutInflater = this.T;
            if (layoutInflater == null) {
                layoutInflater = F(null);
            }
            view = layoutInflater.inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            au(view);
            cq cqVar2 = cuVar.a;
            cqVar2.t = view;
            cqVar2.s = 0;
        } else {
            cuVar.g(this.ah);
        }
        fa(cuVar);
        cv b = cuVar.b();
        if (ay()) {
            Window window = b.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                aib.a(window);
            } else {
                aw();
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void au(View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.ah;
            if (!TextUtils.isEmpty(charSequence)) {
                i = 0;
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() == i) {
                return;
            }
            findViewById.setVisibility(i);
        }
    }

    public abstract void av(boolean z);

    protected void aw() {
    }

    protected boolean ay() {
        return false;
    }

    public final DialogPreference az() {
        if (this.ac == null) {
            this.ac = (DialogPreference) ((ahi) z()).hs(fV().getString("key"));
        }
        return this.ac;
    }

    @Override // defpackage.ai, defpackage.an
    public void e(Bundle bundle) {
        super.e(bundle);
        an z = z();
        if (!(z instanceof ahi)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        ahi ahiVar = (ahi) z;
        String string = fV().getString("key");
        if (bundle == null) {
            DialogPreference dialogPreference = (DialogPreference) ahiVar.hs(string);
            this.ac = dialogPreference;
            this.ad = dialogPreference.a;
            this.ae = dialogPreference.d;
            this.af = dialogPreference.e;
            this.ah = dialogPreference.b;
            this.ai = dialogPreference.f;
            Drawable drawable = dialogPreference.c;
            if (drawable == null || (drawable instanceof BitmapDrawable)) {
                this.aj = (BitmapDrawable) drawable;
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            this.aj = new BitmapDrawable(fU(), createBitmap);
            return;
        }
        this.ad = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.ae = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.af = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.ah = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.ai = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap == null) {
            return;
        }
        this.aj = new BitmapDrawable(fU(), bitmap);
    }

    protected void fa(cu cuVar) {
    }

    @Override // defpackage.ai, defpackage.an
    public void h(Bundle bundle) {
        super.h(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ad);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.ae);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.af);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.ah);
        bundle.putInt("PreferenceDialogFragment.layout", this.ai);
        BitmapDrawable bitmapDrawable = this.aj;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.ag = i;
    }

    @Override // defpackage.ai, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        av(this.ag == -1);
    }
}
