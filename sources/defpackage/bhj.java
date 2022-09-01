package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/* compiled from: PG */
/* renamed from: bhj  reason: default package */
/* loaded from: classes.dex */
public class bhj extends bik implements bii {
    public List a = new ArrayList();
    public Boolean b;
    public Matrix c;
    public String d;
    public int e;

    @Override // defpackage.bii
    public final void b(bim bimVar) {
        if (bimVar instanceof bic) {
            this.a.add(bimVar);
            return;
        }
        String obj = bimVar.toString();
        throw new SAXException("Gradient elements cannot contain " + obj + " elements.");
    }

    @Override // defpackage.bii
    public final List n() {
        return this.a;
    }
}
