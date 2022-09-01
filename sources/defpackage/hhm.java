package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: hhm  reason: default package */
/* loaded from: classes.dex */
public final class hhm implements gzv {
    static final hhl a = hhq.a("back_up_flags_with_proto_data_store", false);
    private Boolean b = null;
    private final SharedPreferences c;

    public hhm(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext.getSharedPreferences(String.valueOf(applicationContext.getPackageName()).concat("_flags_backup"), 0);
        gzt.a.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a() {
        if (this.b == null) {
            this.b = (Boolean) a.c();
            this.c.edit().putBoolean("pref_key_persist_flags_to_data_store", this.b.booleanValue()).apply();
        }
        return this.b.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.c.getBoolean("pref_key_persist_flags_to_data_store", false);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean a2 = a();
        printer.println("persistToDataStore=" + a2);
        boolean b = b();
        printer.println("readFromDataStore=" + b);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "FlagBackUpStrategy";
    }
}
