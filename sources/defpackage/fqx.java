package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* renamed from: fqx  reason: default package */
/* loaded from: classes.dex */
public final class fqx extends fqy {
    final /* synthetic */ Intent a;
    final /* synthetic */ fpq b;

    public fqx(Intent intent, fpq fpqVar) {
        this.a = intent;
        this.b = fpqVar;
    }

    @Override // defpackage.fqy
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
