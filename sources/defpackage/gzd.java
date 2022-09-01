package defpackage;

/* compiled from: PG */
/* renamed from: gzd  reason: default package */
/* loaded from: classes.dex */
public enum gzd implements ido {
    READ("DataFileManager.Read"),
    WRITE("DataFileManager.Write");
    
    private final String d;

    gzd(String str) {
        this.d = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.d;
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
