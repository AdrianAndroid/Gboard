package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;

/* compiled from: PG */
/* renamed from: inw  reason: default package */
/* loaded from: classes.dex */
public final class inw implements ini {
    public final qq a = new qq();
    private final Context b;
    private final Preference c;

    public inw(Context context) {
        this.b = context;
        this.c = new Preference(context);
    }

    private final void a(int i) {
        this.a.add(this.b.getString(i));
    }

    @Override // defpackage.ini
    public final int c(Object obj) {
        throw null;
    }

    @Override // defpackage.ini
    public final Bundle d(Object obj) {
        throw null;
    }

    @Override // defpackage.ini
    public final Object g(int i) {
        return this.c;
    }

    @Override // defpackage.ini
    public final Object k(Object obj) {
        throw null;
    }

    @Override // defpackage.ini
    public final void l(int i, boolean z) {
    }

    @Override // defpackage.ini
    public final void m(int i, CharSequence charSequence) {
    }

    @Override // defpackage.ini
    public final void n(int i, int i2, Object... objArr) {
    }

    @Override // defpackage.ini
    public final void p(Object obj, boolean z) {
        throw null;
    }

    @Override // defpackage.ini
    public final void q(inh inhVar) {
    }

    @Override // defpackage.ini
    public final CharSequence r() {
        return null;
    }

    @Override // defpackage.ini
    public final void s(int i) {
        a(i);
    }

    @Override // defpackage.ini
    public final void t(int i) {
        a(i);
    }

    @Override // defpackage.ini
    public final void u(Object obj) {
        throw null;
    }

    @Override // defpackage.ini
    public final String v() {
        return null;
    }

    @Override // defpackage.ini
    public final void w(int i, boolean z) {
    }

    @Override // defpackage.ini
    public final void x(int i) {
    }
}
