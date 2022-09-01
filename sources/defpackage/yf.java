package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* renamed from: yf  reason: default package */
/* loaded from: classes2.dex */
public final class yf implements yg {
    private final ContentInfo.Builder a;

    public yf(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.yg
    public final yl a() {
        return new yl(new yi(this.a.build()));
    }

    @Override // defpackage.yg
    public final void b(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.yg
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.yg
    public final void d(Uri uri) {
        this.a.setLinkUri(uri);
    }
}
