package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: cwb  reason: default package */
/* loaded from: classes.dex */
public final class cwb implements azn {
    private final lgb a;
    private final idk b;
    private final jls c;

    /* JADX INFO: Access modifiers changed from: protected */
    public cwb(jls jlsVar, idk idkVar, lgb lgbVar, byte[] bArr, byte[] bArr2) {
        this.c = jlsVar;
        this.b = idkVar;
        this.a = lgbVar;
    }

    public static ino c(Context context) {
        return ino.K(context, null);
    }

    @Override // defpackage.azn
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return "content".equals(uri.getScheme()) && "com.bitstrips.imoji.provider".equals(uri.getAuthority());
    }

    @Override // defpackage.azn
    public final /* bridge */ /* synthetic */ fws b(Object obj, int i, int i2, ava avaVar) {
        Uri uri = (Uri) obj;
        return new fws(hjl.b(cvo.d(uri), Integer.valueOf(((aia) this.a.a()).b("bitmoji_avatar_update_version", 0))), new cwa(this.c, this.b, uri, null, null));
    }
}
