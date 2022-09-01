package defpackage;

import org.xml.sax.SAXException;

/* compiled from: PG */
/* renamed from: bix  reason: default package */
/* loaded from: classes.dex */
public class bix extends big {
    @Override // defpackage.big, defpackage.bii
    public final void b(bim bimVar) {
        if (bimVar instanceof biw) {
            this.i.add(bimVar);
            return;
        }
        String obj = bimVar.toString();
        throw new SAXException("Text content elements cannot contain " + obj + " elements.");
    }
}
