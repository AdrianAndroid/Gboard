package defpackage;

import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: lbu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lbu implements lbv {
    public final /* synthetic */ lbw a;
    private final /* synthetic */ int b;

    public /* synthetic */ lbu(lbw lbwVar, int i) {
        this.b = i;
        this.a = lbwVar;
    }

    @Override // defpackage.lbv
    public final void a() {
        int i = this.b;
        if (i == 0) {
            lbw lbwVar = this.a;
            for (int i2 = 0; i2 < lbwVar.a.getAttributeCount(); i2++) {
                if ("defaultErrorCode".equals(lbwVar.a.getAttributeName(i2))) {
                    lbwVar.b.a = Integer.valueOf(lbj.a(lbwVar.a.getAttributeValue(i2)));
                }
            }
            lbwVar.b("split-install-error", new lbu(lbwVar, 1));
        } else if (i == 1) {
            lbw lbwVar2 = this.a;
            String str = null;
            String str2 = null;
            for (int i3 = 0; i3 < lbwVar2.a.getAttributeCount(); i3++) {
                if ("module".equals(lbwVar2.a.getAttributeName(i3))) {
                    str = lbwVar2.a.getAttributeValue(i3);
                }
                if ("errorCode".equals(lbwVar2.a.getAttributeName(i3))) {
                    str2 = lbwVar2.a.getAttributeValue(i3);
                }
            }
            if (str == null || str2 == null) {
                throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), lbwVar2.a, null);
            }
            lbwVar2.b.d().put(str, Integer.valueOf(lbj.a(str2)));
            do {
            } while (lbwVar2.a.next() != 3);
        } else {
            lbw lbwVar3 = this.a;
            lbwVar3.b("split-install-errors", new lbu(lbwVar3, 0));
        }
    }
}
