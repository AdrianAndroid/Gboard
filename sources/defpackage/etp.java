package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: etp  reason: default package */
/* loaded from: classes.dex */
public final class etp implements dlm {
    public lgb a;
    public ImageView b;
    public Drawable c;
    public dln d;
    final /* synthetic */ etq e;

    public etp(etq etqVar, lgb lgbVar) {
        this.e = etqVar;
        this.a = lgbVar;
    }

    public final void a() {
        dln dlnVar = this.d;
        if (dlnVar != null) {
            ((dlp) dlnVar).c();
            this.d = null;
        }
    }

    @Override // defpackage.dlm
    public final void b(String str, Drawable drawable) {
        this.d = null;
        this.c = drawable;
        ImageView imageView = this.b;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        final ImageView imageView = this.b;
        if (imageView == null) {
            return;
        }
        a();
        boolean p = this.e.e.p();
        Context context = this.e.b;
        final float a = etq.a(p);
        etq.d(context, new hit() { // from class: eto
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.hit
            public final Object a(Object obj, Object obj2) {
                etp etpVar = etp.this;
                float f = a;
                ImageView imageView2 = imageView;
                iav iavVar = (iav) obj;
                int b = etq.b(iavVar);
                dlq c = etq.c(etpVar.e.b, (eqg) etpVar.a.a(), b, etpVar.e.d, etq.h(iavVar), f);
                etpVar.c = c.b();
                imageView2.setImageDrawable(etpVar.c);
                dln e = c.e(iavVar, iavVar.b, obj2, ibz.a, obj2.c(b), etpVar);
                etpVar.d = e;
                return e;
            }
        });
    }
}
