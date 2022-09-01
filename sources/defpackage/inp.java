package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: inp  reason: default package */
/* loaded from: classes.dex */
public final class inp implements ind {
    private final SharedPreferences a;
    private final SharedPreferences.Editor b;
    private final String c;

    public inp(Context context, String str) {
        String concat = String.valueOf(context.getPackageName()).concat(String.valueOf(str));
        this.c = concat;
        SharedPreferences sharedPreferences = context.getSharedPreferences(concat, 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    @Override // defpackage.lgb
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ind
    public final SharedPreferences.Editor d() {
        return this.b;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.ind
    public final String e() {
        return this.c;
    }

    @Override // defpackage.ind
    public final /* synthetic */ void f(inc incVar) {
    }

    @Override // defpackage.ind
    public final boolean g() {
        return false;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }
}
