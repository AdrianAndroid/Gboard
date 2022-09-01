package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ngs  reason: default package */
/* loaded from: classes2.dex */
public final class ngs {
    private static final ngx b = new ngq(0);
    public final ngx a;

    public ngs() {
        ngx ngxVar;
        ngx[] ngxVarArr = new ngx[2];
        ngxVarArr[0] = ngq.a;
        try {
            ngxVar = (ngx) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            ngxVar = b;
        }
        ngxVarArr[1] = ngxVar;
        ngr ngrVar = new ngr(ngxVarArr);
        ngb.i(ngrVar, "messageInfoFactory");
        this.a = ngrVar;
    }

    public static boolean a(ngw ngwVar) {
        return ngwVar.c() == 1;
    }
}
