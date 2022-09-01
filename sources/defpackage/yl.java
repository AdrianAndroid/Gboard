package defpackage;

import android.view.ContentInfo;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: yl  reason: default package */
/* loaded from: classes2.dex */
public final class yl {
    public final yj a;

    public yl(yj yjVar) {
        this.a = yjVar;
    }

    public static yl b(ContentInfo contentInfo) {
        return new yl(new yi(contentInfo));
    }

    public final ContentInfo a() {
        return (ContentInfo) Objects.requireNonNull(this.a.d());
    }

    public final String toString() {
        return this.a.toString();
    }
}
