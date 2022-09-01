package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: iag  reason: default package */
/* loaded from: classes.dex */
public class iag {
    public static final lug a = hin.a;
    private static final lfy b = lfy.c('=');
    private final Map c = lre.q();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(Context context, AttributeSet attributeSet, int i, hzv hzvVar, lfy lfyVar) {
        int length;
        String attributeValue = attributeSet.getAttributeValue(i);
        if (attributeValue == null || (length = attributeValue.length()) <= 2 || attributeValue.charAt(0) != '$' || attributeValue.charAt(length - 1) != '$') {
            hzvVar.b(context, attributeSet, i, attributeValue, lfyVar);
            return;
        }
        List k = b.k(attributeValue.substring(1, attributeValue.length() - 1));
        if (k.size() > 2) {
            throw new XmlPullParserException("Template format is not correct.");
        }
        List list = (List) this.c.get(k.get(0));
        if (list == null) {
            list = lre.A();
            this.c.put((String) k.get(0), list);
        }
        list.add(hzvVar);
        if (k.size() != 2) {
            return;
        }
        hzvVar.e(context, (String) k.get(1), lfyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d(Context context, AttributeSet attributeSet, String str, int i, lfy lfyVar) {
        List<hzv> list = (List) this.c.get(str);
        if (list == null) {
            return false;
        }
        for (hzv hzvVar : list) {
            hzvVar.b(context, attributeSet, i, null, lfyVar);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Context context, String str, String str2, lfy lfyVar) {
        List<hzv> list = (List) this.c.get(str);
        if (list == null) {
            return;
        }
        for (hzv hzvVar : list) {
            hzvVar.c(context, str2, lfyVar);
        }
    }

    public final void x() {
        for (List<hzv> list : this.c.values()) {
            for (hzv hzvVar : list) {
                hzvVar.d();
            }
        }
    }
}
