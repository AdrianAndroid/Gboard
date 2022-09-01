package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fsn  reason: default package */
/* loaded from: classes.dex */
public final class fsn extends fss {
    final /* synthetic */ Map a;
    final /* synthetic */ ijk b;
    final /* synthetic */ opu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsn(ijk ijkVar, String str, Map map, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(str);
        this.b = ijkVar;
        this.a = map;
        this.c = opuVar;
    }

    @Override // defpackage.fss
    protected final void a(fsk fskVar) {
        ((Handler) this.b.b).removeCallbacksAndMessages(this);
        ijk ijkVar = this.b;
        fsp fspVar = new fsp(fskVar, (Handler) ijkVar.b, this.a, this.e, this.f, (fsu) ijkVar.a, this.c, null, null, null, null);
        long a = fspVar.d.a();
        fspVar.b.postAtTime(new fsm(fspVar, a, fspVar, 2), fspVar, a + SystemClock.uptimeMillis());
        String a2 = fspVar.a.a(fspVar.c);
        fspVar.a.b();
        fspVar.b.removeCallbacksAndMessages(fspVar);
        fspVar.a(a2);
    }
}
