package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: ego  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ego implements leq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ego(egm egmVar, int i, int i2) {
        this.c = i2;
        this.b = egmVar;
        this.a = i;
    }

    public /* synthetic */ ego(egp egpVar, int i, int i2) {
        this.c = i2;
        this.b = egpVar;
        this.a = i;
    }

    public /* synthetic */ ego(ehp ehpVar, int i, int i2) {
        this.c = i2;
        this.b = ehpVar;
        this.a = i;
    }

    public /* synthetic */ ego(eis eisVar, int i, int i2) {
        this.c = i2;
        this.b = eisVar;
        this.a = i;
    }

    public /* synthetic */ ego(ett ettVar, int i, int i2) {
        this.c = i2;
        this.b = ettVar;
        this.a = i;
    }

    public /* synthetic */ ego(ewk ewkVar, int i, int i2) {
        this.c = i2;
        this.b = ewkVar;
        this.a = i;
    }

    public /* synthetic */ ego(gbx gbxVar, int i, int i2) {
        this.c = i2;
        this.b = gbxVar;
        this.a = i;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.c) {
            case 0:
                return ((egp) this.b).b.a() == this.a ? atk.HIGH : atk.LOW;
            case 1:
                return ((egm) this.b).b.a() == this.a ? atk.HIGH : atk.LOW;
            case 2:
                return ((ehp) this.b).c.a() == this.a ? atk.HIGH : atk.LOW;
            case 3:
                return ((eis) this.b).c.a() == this.a ? atk.HIGH : atk.LOW;
            case 4:
                Object obj2 = this.b;
                int i = this.a;
                jqm jqmVar = (jqm) obj;
                ett ettVar = (ett) obj2;
                ettVar.f.set(jqmVar);
                ettVar.g.set(i);
                return jqmVar;
            case 5:
                Void r4 = (Void) obj;
                ((ewk) this.b).a(this.a);
                return null;
            case 6:
                Object obj3 = this.b;
                int i2 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    ldu lduVar = ldu.a;
                    ((gbx) obj3).o(i2, lduVar, lduVar);
                    return Status.a;
                }
                ((gbx) obj3).o(i2, lfb.g(mge.ERROR_REASON_FILE_DELETION), ldu.a);
                return new Status(25001, "Error occurs when deleting output directory!");
            default:
                IOException iOException = (IOException) obj;
                ((gbx) this.b).o(this.a, lfb.g(mge.ERROR_REASON_IO_EXCEPTION), ldu.a);
                return new Status(8, "IOException");
        }
    }
}
