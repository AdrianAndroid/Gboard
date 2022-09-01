package defpackage;

import android.os.Handler;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fsp  reason: default package */
/* loaded from: classes.dex */
final class fsp {
    public final fsk a;
    public final Handler b;
    public final Map c;
    public final fsl d;
    public final fth e;
    public final fsu f;
    public final opu g;
    private boolean h = false;

    public fsp(fsk fskVar, Handler handler, Map map, fsl fslVar, fth fthVar, fsu fsuVar, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = fskVar;
        this.b = handler;
        this.c = map;
        this.d = fslVar;
        this.e = fthVar;
        this.f = fsuVar;
        this.g = opuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        synchronized (this) {
            if (this.h) {
                return;
            }
            this.h = true;
            try {
                this.b.post(new fso(this, str, 0));
            } catch (RuntimeException unused) {
            }
        }
    }
}
