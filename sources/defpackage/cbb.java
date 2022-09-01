package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cbb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cbb implements FilenameFilter {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cbb(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ cbb(String str, int i, byte[] bArr) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ cbb(String str, int i, char[] cArr) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ cbb(List list, int i) {
        this.b = i;
        this.a = list;
    }

    public /* synthetic */ cbb(Map map, int i) {
        this.b = i;
        this.a = map;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List, java.lang.Object] */
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.b;
        if (i == 0) {
            ?? r0 = this.a;
            ltg ltgVar = cbd.a;
            if (!str.endsWith("_d3.dict")) {
                return false;
            }
            r0.put(Locale.forLanguageTag(str.substring(0, str.length() - 8).replace('_', '-')), file);
            return true;
        } else if (i == 1) {
            return str.startsWith((String) this.a);
        } else {
            if (i == 2) {
                ?? r02 = this.a;
                ltg ltgVar2 = cbd.a;
                if (!str.endsWith("_d3.dict")) {
                    return false;
                }
                r02.put(Locale.forLanguageTag(str.substring(0, str.length() - 8).replace('_', '-')), file);
                return true;
            } else if (i == 3) {
                Object obj = this.a;
                lug lugVar = dri.a;
                return str.startsWith((String) obj);
            } else if (i == 4) {
                for (String str2 : this.a) {
                    if (str.endsWith(str2)) {
                        return true;
                    }
                }
                return false;
            } else {
                return str.endsWith((String) this.a);
            }
        }
    }
}
