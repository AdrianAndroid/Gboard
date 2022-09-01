package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: dhe  reason: default package */
/* loaded from: classes.dex */
public final class dhe extends dhn {
    public dhe(bze bzeVar, Context context, ExecutorService executorService) {
        super(bzeVar, context, executorService, "handwriting_recognition_offline");
        dhm dhmVar = dhm.ONLINE;
    }

    @Override // defpackage.dhn
    public final int a() {
        return 1;
    }

    @Override // defpackage.dhn
    public final bzu b(Context context) {
        bzt a = bzu.a(this.l);
        a.b(new dhs(context, jan.b, this.l, gxo.a(2)));
        a.e = 500;
        a.f = 500;
        return a.a();
    }

    @Override // defpackage.dhn
    public final dhm c() {
        return dhm.OFFLINE;
    }

    @Override // defpackage.dhn
    public final String d() {
        return "local://handwriting.superpack_manifest.local.json";
    }

    @Override // defpackage.dhn
    public final void e() {
        if (!k()) {
            kcu.U(mio.h(mkh.q(mio.h(i(), new bzi(this, 4), this.j)), new bzi(this, 3), this.j), new cbx(4), this.j);
        }
    }
}
