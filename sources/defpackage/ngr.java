package defpackage;

/* compiled from: PG */
/* renamed from: ngr  reason: default package */
/* loaded from: classes2.dex */
final class ngr implements ngx {
    private final ngx[] a;

    public ngr(ngx... ngxVarArr) {
        this.a = ngxVarArr;
    }

    @Override // defpackage.ngx
    public final ngw a(Class cls) {
        ngx[] ngxVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            ngx ngxVar = ngxVarArr[i];
            if (ngxVar.b(cls)) {
                return ngxVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.ngx
    public final boolean b(Class cls) {
        ngx[] ngxVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (ngxVarArr[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
