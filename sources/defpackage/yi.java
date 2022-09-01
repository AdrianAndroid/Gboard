package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: PG */
/* renamed from: yi  reason: default package */
/* loaded from: classes2.dex */
final class yi implements yj {
    private final ContentInfo a;

    public yi(ContentInfo contentInfo) {
        nq.g(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.yj
    public final int a() {
        return this.a.getFlags();
    }

    @Override // defpackage.yj
    public final int b() {
        return this.a.getSource();
    }

    @Override // defpackage.yj
    public final ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.yj
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
