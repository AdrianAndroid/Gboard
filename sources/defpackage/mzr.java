package defpackage;

/* compiled from: PG */
/* renamed from: mzr  reason: default package */
/* loaded from: classes2.dex */
final class mzr extends olm implements okv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzr(Object obj, mzz mzzVar, int i) {
        super(3);
        this.c = i;
        this.b = obj;
        this.a = mzzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzr(mzs mzsVar, String str, int i) {
        super(3);
        this.c = i;
        this.a = mzsVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzr(nab nabVar, String str, int i) {
        super(3);
        this.c = i;
        this.a = nabVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzr(nac nacVar, String str, int i) {
        super(3);
        this.c = i;
        this.a = nacVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzr(ojc ojcVar, mzz mzzVar, int i) {
        super(3);
        this.c = i;
        this.b = ojcVar;
        this.a = mzzVar;
    }

    @Override // defpackage.okv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        if (i == 0) {
            oll.e(obj2, "s1");
            oll.e(obj3, "e1");
            return mzw.q(((mzs) this.a).a.b((String) this.b, (mzz) obj3), new mzr(obj, (mzz) obj2, 1));
        } else if (i == 1) {
            oll.e(obj2, "<anonymous parameter 1>");
            oll.e(obj3, "e2");
            return new mzu(new ojc(this.b, obj), (mzz) this.a, (mzz) obj3);
        } else if (i != 2) {
            if (i == 3) {
                oll.e(obj2, "<anonymous parameter 1>");
                oll.e(obj3, "e2");
                ojc ojcVar = (ojc) this.b;
                return new mzu(new ojf(ojcVar.a, ojcVar.b, obj), (mzz) this.a, (mzz) obj3);
            }
            ojc ojcVar2 = (ojc) obj;
            oll.e(ojcVar2, "v1");
            oll.e(obj2, "s1");
            oll.e(obj3, "e1");
            return mzw.q(((nac) this.a).a.b((String) this.b, (mzz) obj3), new mzr(ojcVar2, (mzz) obj2, 3));
        } else {
            oll.e(obj2, "start");
            oll.e(obj3, "end");
            try {
                return new mzu(((nab) this.a).a.a(obj), (mzz) obj2, (mzz) obj3);
            } catch (Exception e) {
                Object obj4 = this.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Exception while parsing";
                }
                return ndb.v((mzv) obj4, message, (String) this.b, (mzz) obj2).a((mzv) this.a);
            }
        }
    }
}
