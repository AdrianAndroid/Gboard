package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: etq  reason: default package */
/* loaded from: classes.dex */
public final class etq {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/ThemeDetailsPreviewManager");
    public final Context b;
    public final String c;
    public boolean d;
    public eul e;
    public final etp[] f;

    public etq(Context context, String str, eul eulVar, boolean z, Drawable drawable) {
        this.b = context;
        this.c = str;
        this.e = eulVar;
        this.d = z;
        if (eulVar.p()) {
            Objects.requireNonNull(eulVar);
            Objects.requireNonNull(eulVar);
            this.f = new etp[]{new etp(this, new etm(eulVar, 1)), new etp(this, new etm(eulVar, 0))};
        } else {
            Objects.requireNonNull(eulVar);
            this.f = new etp[]{new etp(this, new etm(eulVar, 1))};
        }
        this.f[0].c = drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(boolean z) {
        return z ? 0.6f : 1.0f;
    }

    public static int b(iav iavVar) {
        ibw ibwVar = iavVar.f;
        return hyq.e(ibwVar.i, ibwVar.h);
    }

    public static dlq c(Context context, eqg eqgVar, int i, boolean z, boolean z2, float f) {
        return new dlq(context, new ess(context, eqgVar, i, z), dds.a, f, z2);
    }

    public static void d(Context context, hit hitVar) {
        kcu.U(hrx.y(context).b(), new eay(hitVar, 4), gyc.b);
    }

    public static void e(final Context context, final eqg eqgVar, final boolean z, final dlm dlmVar, final float f) {
        d(context, new hit() { // from class: etn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.hit
            public final Object a(Object obj, Object obj2) {
                Context context2 = context;
                eqg eqgVar2 = eqgVar;
                boolean z2 = z;
                float f2 = f;
                dlm dlmVar2 = dlmVar;
                iav iavVar = (iav) obj;
                int b = etq.b(iavVar);
                return etq.c(context2, eqgVar2, b, z2, etq.h(iavVar), f2).e(iavVar, iavVar.b, obj2, ibz.a, obj2.c(b), dlmVar2);
            }
        });
    }

    public static boolean h(iav iavVar) {
        int i = iavVar.f.f;
        return (i == 0 || i == R.style.f193600_resource_name_obfuscated_res_0x7f1502bc) ? false : true;
    }

    public final void f(ImageView... imageViewArr) {
        int i = 0;
        if (this.f.length != imageViewArr.length) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeDetailsPreviewManager", "setPreviewView", 143, "ThemeDetailsPreviewManager.java")).t("items.length and previewView.length are different");
        }
        while (true) {
            etp[] etpVarArr = this.f;
            if (i >= etpVarArr.length || i >= imageViewArr.length) {
                return;
            }
            etp etpVar = etpVarArr[i];
            ImageView imageView = imageViewArr[i];
            etpVar.b = imageView;
            etpVar.b.setContentDescription(etpVar.e.c);
            Drawable drawable = etpVar.c;
            if (drawable == null) {
                etpVar.c();
            } else {
                imageView.setImageDrawable(drawable);
            }
            i++;
        }
    }

    public final void g() {
        for (etp etpVar : this.f) {
            etpVar.c();
        }
    }
}
