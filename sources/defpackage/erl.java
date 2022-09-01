package defpackage;

/* compiled from: PG */
/* renamed from: erl  reason: default package */
/* loaded from: classes.dex */
public enum erl implements ids {
    THEME_PACKAGE_DOWNLOAD_TIME("Theme.package.download-time"),
    THEME_RESTORE_PACKAGE_DOWNLOAD_TIME("Theme.restore.package.download-time");
    
    private final String d;

    erl(String str) {
        this.d = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.d;
    }
}
