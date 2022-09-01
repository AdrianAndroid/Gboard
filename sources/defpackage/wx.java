package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: wx  reason: default package */
/* loaded from: classes2.dex */
final class wx implements ww {
    private final LocaleList a;

    public wx(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // defpackage.ww
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.ww
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.ww
    public final String c() {
        return this.a.toLanguageTags();
    }

    @Override // defpackage.ww
    public final Locale d(int i) {
        return this.a.get(i);
    }

    @Override // defpackage.ww
    public final boolean e() {
        return this.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((ww) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
