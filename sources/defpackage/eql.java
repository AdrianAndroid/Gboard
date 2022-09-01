package defpackage;

import android.graphics.Bitmap;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eql  reason: default package */
/* loaded from: classes.dex */
public final class eql implements eri {
    private final eri a;
    private final euw b;
    private final eve c;
    private final String d;

    public eql(eri eriVar, euw euwVar, eve eveVar, String str) {
        this.a = eriVar;
        this.b = euwVar;
        this.c = eveVar;
        this.d = str;
    }

    @Override // defpackage.eri
    public final Bitmap a(String str, int i, int i2) {
        return null;
    }

    @Override // defpackage.eri
    public final euw c(Set set, euw euwVar) {
        return era.p(this.a.c(set, euwVar), this.b);
    }

    @Override // defpackage.eri
    public final eve e() {
        return this.c;
    }

    @Override // defpackage.eri
    public final String f() {
        return this.d;
    }
}
