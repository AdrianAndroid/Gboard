package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: gfm  reason: default package */
/* loaded from: classes.dex */
final class gfm extends gfi {
    private final fov a;
    private final gfj b;
    private final gdo c;

    public gfm(gfj gfjVar, fov fovVar, gdo gdoVar, byte[] bArr) {
        this.b = gfjVar;
        this.a = fovVar;
        this.c = gdoVar;
    }

    @Override // defpackage.gfi
    public final void c(Status status) {
        if (!status.a()) {
            this.a.h();
        } else {
            this.a.h();
        }
    }

    @Override // defpackage.gfi
    public final void d(Status status) {
        if (!status.a()) {
            this.a.h();
            return;
        }
        gdo gdoVar = this.c;
        if (gdoVar == null) {
            this.a.h();
        } else {
            this.b.e(gdoVar, this);
        }
    }
}
