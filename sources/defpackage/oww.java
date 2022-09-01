package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* renamed from: oww  reason: default package */
/* loaded from: classes2.dex */
final class oww implements oxb {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ owy b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public oww(owy owyVar, UrlResponseInfo urlResponseInfo, String str, int i) {
        this.d = i;
        this.b = owyVar;
        this.a = urlResponseInfo;
        this.c = str;
    }

    public oww(owy owyVar, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, int i) {
        this.d = i;
        this.b = owyVar;
        this.a = urlResponseInfo;
        this.c = byteBuffer;
    }

    @Override // defpackage.oxb
    public final void a() {
        if (this.d == 0) {
            if (!this.b.d.g.compareAndSet(5, 4)) {
                return;
            }
            owy owyVar = this.b;
            owyVar.a.onReadCompleted(owyVar.d, this.a, (ByteBuffer) this.c);
            return;
        }
        owy owyVar2 = this.b;
        owyVar2.a.onRedirectReceived(owyVar2.d, this.a, (String) this.c);
    }
}
