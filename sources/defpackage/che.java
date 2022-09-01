package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: che  reason: default package */
/* loaded from: classes.dex */
public class che implements chg {
    private final cuj a;

    public che(cuj cujVar) {
        this.a = cujVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Uri a(Object obj) {
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return obj instanceof cqp ? ((cqp) obj).d() : Uri.EMPTY;
    }

    @Override // defpackage.chg
    public final void b(Uri uri, chh chhVar) {
        int i = 0;
        for (Uri uri2 : this.a.y().map(new chd(this, 0))) {
            if (uri2.equals(uri)) {
                this.a.C(i, chhVar);
                return;
            }
            i++;
        }
    }
}
