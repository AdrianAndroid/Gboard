package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: dzv  reason: default package */
/* loaded from: classes.dex */
public final class dzv extends che {
    public dzv(cuj cujVar) {
        super(cujVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.che
    public final Uri a(Object obj) {
        if (!(obj instanceof dzq)) {
            return super.a(obj);
        }
        dzq dzqVar = (dzq) obj;
        int b = dzqVar.b() - 1;
        if (b == 0) {
            return dzqVar.d().a.d();
        }
        return b != 2 ? Uri.EMPTY : dzqVar.a().a.d();
    }
}
