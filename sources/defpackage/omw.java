package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: omw  reason: default package */
/* loaded from: classes2.dex */
public final class omw extends olm implements oku {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omw(List list) {
        super(2);
        this.a = list;
    }

    @Override // defpackage.oku
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        Object obj3;
        ojc b;
        Object obj4;
        Object obj5;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        List list = this.a;
        if (list.size() == 1) {
            oll.e(list, "<this>");
            if (list instanceof List) {
                oll.e(list, "<this>");
                int size = list.size();
                if (size == 0) {
                    throw new NoSuchElementException("List is empty.");
                }
                if (size == 1) {
                    obj5 = list.get(0);
                } else {
                    throw new IllegalArgumentException("List has more than one element.");
                }
            } else {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                Object next = it.next();
                if (it.hasNext()) {
                    throw new IllegalArgumentException("Collection has more than one element.");
                }
                obj5 = next;
            }
            String str = (String) obj5;
            int j = ols.j(charSequence, str, intValue, 4);
            if (j >= 0) {
                b = oix.b(Integer.valueOf(j), str);
            }
            b = null;
        } else {
            olw olwVar = new olw(ols.b(intValue, 0), charSequence.length());
            if (charSequence instanceof String) {
                int i = olwVar.a;
                int i2 = olwVar.b;
                if (i <= i2) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it2.next();
                            String str2 = (String) obj4;
                            String str3 = (String) charSequence;
                            int length = str2.length();
                            oll.e(str2, "<this>");
                            oll.e(str3, "other");
                            if (str2.regionMatches(0, str3, i, length)) {
                                break;
                            }
                        }
                        String str4 = (String) obj4;
                        if (str4 == null) {
                            if (i == i2) {
                                break;
                            }
                            i++;
                        } else {
                            b = oix.b(Integer.valueOf(i), str4);
                            break;
                        }
                    }
                }
                b = null;
            } else {
                int i3 = olwVar.a;
                int i4 = olwVar.b;
                if (i3 <= i4) {
                    while (true) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it3.next();
                            String str5 = (String) obj3;
                            if (ols.k(str5, charSequence, i3, str5.length())) {
                                break;
                            }
                        }
                        String str6 = (String) obj3;
                        if (str6 == null) {
                            if (i3 == i4) {
                                break;
                            }
                            i3++;
                        } else {
                            b = oix.b(Integer.valueOf(i3), str6);
                            break;
                        }
                    }
                }
                b = null;
            }
        }
        if (b != null) {
            return oix.b(b.a, Integer.valueOf(((String) b.b).length()));
        }
        return null;
    }
}
