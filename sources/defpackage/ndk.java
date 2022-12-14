package defpackage;

import java.util.ArrayList;
import java.util.regex.Matcher;

/* compiled from: PG */
/* renamed from: ndk  reason: default package */
/* loaded from: classes2.dex */
public final class ndk {
    private final ArrayList a;
    private final String b;

    public ndk(String str) {
        this.a = new ArrayList();
        this.b = str;
    }

    final ndi a() {
        ndi ndiVar = new ndi();
        int size = this.a.size();
        ndiVar.b = " " + size;
        this.a.add(ndiVar);
        return ndiVar;
    }

    public final String b(CharSequence charSequence) {
        String obj = charSequence.toString();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ndi ndiVar = (ndi) arrayList.get(i);
            StringBuilder sb = new StringBuilder();
            Matcher[] matcherArr = new Matcher[((ArrayList) ndiVar.a).size()];
            for (int i2 = 0; i2 < ((ArrayList) ndiVar.a).size(); i2++) {
                matcherArr[i2] = ((ndj) ((ArrayList) ndiVar.a).get(i2)).a.matcher("");
            }
            boolean z = true;
            while (obj.length() > 0) {
                boolean z2 = false;
                for (int i3 = 0; i3 < ((ArrayList) ndiVar.a).size(); i3++) {
                    ndj ndjVar = (ndj) ((ArrayList) ndiVar.a).get(i3);
                    if (!ndjVar.c || z) {
                        Matcher matcher = matcherArr[i3];
                        matcher.reset(obj);
                        if (matcher.find()) {
                            int length = obj.length() - matcher.group(0).length();
                            String replaceFirst = matcher.replaceFirst(ndjVar.b);
                            if (ndjVar.d < 0) {
                                int length2 = replaceFirst.length() - length;
                                sb.append((CharSequence) replaceFirst, 0, length2);
                                obj = replaceFirst.substring(length2);
                            } else {
                                obj = replaceFirst;
                            }
                            z2 = true;
                        }
                    }
                }
                if (!z2) {
                    sb.append(obj.charAt(0));
                    obj = obj.substring(1);
                }
                z = false;
            }
            obj = sb.toString();
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.lang.Object] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Transliterator name = ");
        sb.append(this.b);
        sb.append("\n  Phase count: ");
        sb.append(this.a.size());
        sb.append("\n");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ndi ndiVar = (ndi) arrayList.get(i);
            StringBuilder sb2 = new StringBuilder("  Phase ");
            sb2.append((String) ndiVar.b);
            sb2.append(" has ");
            sb2.append(((ArrayList) ndiVar.a).size());
            sb2.append(" rules\n");
            ?? r7 = ndiVar.a;
            int size2 = r7.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ndj ndjVar = (ndj) r7.get(i2);
                String str = "    R " + ndjVar.e + " p: " + String.valueOf(ndjVar.a) + " s: " + ndjVar.b;
                if (ndjVar.c) {
                    str = str.concat(" matchOnStart=True ");
                }
                if (ndjVar.d >= 0) {
                    str = str + " revisitPosition= 0";
                }
                if (ndjVar.c) {
                    str = str.concat(" matchOnStart = true");
                }
                if (!"".equals(ndjVar.f)) {
                    str = str + " contextAfter = " + ndjVar.f;
                }
                if (!"".equals(ndjVar.g)) {
                    str = str + " contextAfter = " + ndjVar.g;
                }
                sb2.append(str.concat("\n"));
            }
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public ndk() {
        this("Unicode to Zawgyi");
        ndi a = a();
        a.a(new ndj("[?????????]??????([???-???])???", "$1??????"));
        a.a(new ndj("[?????????]??????([???-???])??????", "$1???"));
        a.a(new ndj("[?????????]??????([???-???])???", "$1???"));
        a.a(new ndj("[?????????]??????([???-???])???", "$1???"));
        a.a(new ndj("[?????????]??????([???-???])???", "$1???"));
        a.a(new ndj("[?????????]??????([???-???])???", "$1??????"));
        a.a(new ndj("[?????????]??????([???-???])?????????", "$1?????????"));
        a.a(new ndj("[?????????]??????([???-???])??????", "$1??????"));
        a.a(new ndj("[?????????]??????([???-???])?????????", "$1?????????"));
        a.a(new ndj("[?????????]??????([???-???])??????", "$1??????"));
        a.a(new ndj("[?????????]??????([???-???])??????", "$1??????"));
        a.a(new ndj("[?????????]??????([???-???])???", "$1??????"));
        a.a(new ndj("[?????????]?????????", "???"));
        a.a(new ndj("[?????????]?????????", "???"));
        a.a(new ndj("[?????????]?????????", "???"));
        a.a(new ndj("[?????????]??????([???-???])", "$1???"));
        a.a(new ndj("???([???-??????])???", "???$1???"));
        a.a(new ndj("?????????", "?????????"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("([???])??????", "$1??????"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("?????????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("??????", "???"));
        a.a(new ndj("?????????", "???"));
        a.a(new ndj("?????????", "???"));
        a.a(new ndj("?????????", "???"));
        a.a(new ndj("?????????", "???"));
        a.a(new ndj("?????????", "???"));
        a.a(new ndj("????????????", "???"));
        ndi a2 = a();
        a2.a(new ndj("???([???-????????????-????????????])([??????????????????]*)???", "??????$1$2"));
        a2.a(new ndj("??????([??????]*)(???*)", "$2??????$1"));
        a2.a(new ndj("([???-???])???([??????]*)???", "??????$1$2"));
        a2.a(new ndj("([???-???])???", "???$1"));
        a2.a(new ndj("([???-???])?????????", "???$1??????"));
        a2.a(new ndj("([???-???])(???)???", "???$1$2"));
        a2.a(new ndj("([???-???])??????", "???$1???"));
        a2.a(new ndj("([???-???])([?????????]+)???", "???$1$2"));
        a2.a(new ndj("([???-???])([???-????????????-????????????])([??????????????????]*)???", "???$1$2$3"));
        a2.a(new ndj("([???-???])???", "???$1"));
        a2.a(new ndj("???([???-????????????-????????????])", "???$1"));
        a2.a(new ndj("???([??????????????????-???])([??????????????????])???", "???$1$2???"));
        a2.a(new ndj("???([??????????????????])([??????????????????-???])???", "???$1$2???"));
        a2.a(new ndj("???([??????????????????])???", "???$1???"));
        a2.a(new ndj("?????????", "?????????"));
        a2.a(new ndj("??????", "??????"));
        a2.a(new ndj("??????([??????????????????-???])???", "???$1??????"));
        a2.a(new ndj("???([??????????????????])([??????????????????-???])", "???$1$2"));
        a2.a(new ndj("???([??????????????????-???])([??????????????????])", "???$1$2"));
        a2.a(new ndj("???([??????????????????-???])???", "???$1???"));
        a2.a(new ndj("???([??????????????????-???])", "???$1"));
        a2.a(new ndj("([??????????????????-???])([??????????????????]*)???", "$1$2???"));
        a2.a(new ndj("([^???-???])???([???-???])", "$1???$2"));
        a2.a(new ndj("([^???-???])???", "$1???"));
        a2.a(new ndj("??????([^???-???])", "??????$1"));
        a2.a(new ndj("??????", "??????"));
        a2.a(new ndj("??????", "???"));
        a2.a(new ndj("??????", "??????"));
        a2.a(new ndj("([????????????])([?????????])", "$2$1"));
        ndi a3 = a();
        a3.a(new ndj("??????", "??????"));
        a3.a(new ndj("??????", "??????"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])([???-????????????-????????????])([??????????????????])", "???$1$2$3"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])([???-????????????-????????????])([??????????????????])", "???$1$2$3"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])([???-????????????-????????????])", "???$1$2"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])([???-????????????-????????????])", "???$1$2"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])([??????])([??????????????????])", "???$1$2$3"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])([??????])([??????????????????])", "???$1$2$3"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])???([??????????????????])", "???$1???$2"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])???([??????????????????])", "???$1???$2"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])???([??????????????????])", "???$1???$2"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])???([??????????????????])", "???$1???$2"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])???([??????????????????])", "???$1???$2"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])???([??????????????????])", "???$1???$2"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])([??????????????????-???]*)([??????????????????])", "???$1$2$3"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])([??????????????????-???]*)([??????????????????])", "???$1$2$3"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])([??????])", "???$1$2"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])([??????])", "???$1$2"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])???", "???$1???"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])???", "???$1???"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])???", "???$1???"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])???", "???$1???"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])???", "???$1???"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])???", "???$1???"));
        a3.a(new ndj("[??????-???]([??????])", "???$1"));
        a3.a(new ndj("[??????-???]([??????])", "??????"));
        a3.a(new ndj("[??????-???]([??????????????????-????????????-?????????????????????])", "???$1"));
        a3.a(new ndj("[??????-???]([??????????????????-??????????????????])", "???$1"));
        a3.a(new ndj("???([??????????????????-???])", "???$1"));
        a3.a(new ndj("???([??????????????????-???])", "???$1"));
        a3.a(new ndj("??????", "??????"));
        a3.a(new ndj("???([??????????????????])???[?????????]", "???$1??????"));
        a3.a(new ndj("??????[?????????]", "?????????"));
        a3.a(new ndj("??????", "??????"));
        a3.a(new ndj("??????", "???"));
        ndi a4 = a();
        a4.a(new ndj("???([???-?????????])", "$1???"));
        a4.a(new ndj("([???-???])([???-?????????-???])???([???-???])", "$1???$2$3"));
        a4.a(new ndj("??????", "???"));
        a4.a(new ndj("??????", "??????"));
        a4.a(new ndj("([??????-???])([??????????????????-????????????-?????????????????????])([??????????????????-???]*)([??????????????????]*)???", "$1$2$3$4???"));
        a4.a(new ndj("([??????-???])([??????????????????-??????????????????])([??????????????????-???]*)([??????????????????]*)???", "$1$2$3$4???"));
        a4.a(new ndj("([??????-???])([??????????????????-????????????-?????????????????????])([??????????????????-???]*)([??????????????????]*)???", "$1$2$3$4???"));
        a4.a(new ndj("([??????-???])([??????????????????-??????????????????])([??????????????????-???]*)([??????????????????]*)???", "$1$2$3$4???"));
        ndi a5 = a();
        a5.a(new ndj("([??????])???", "???$1"));
        a5.a(new ndj("??????", "??????"));
        a5.a(new ndj("???([???-?????????-???])", "$1???"));
        a5.a(new ndj("???([?????????])", "$1???"));
        a5.a(new ndj("???([??????-???])??????", "???$1??????"));
        a5.a(new ndj("?????????", "?????????"));
        ndi a6 = a();
        a6.a(new ndj("([???-???])??????", "$1??????"));
        a6.a(new ndj("([???-???])???", "???$1"));
        a6.a(new ndj("([??????])???", "???$1"));
        a6.a(new ndj("??????", "??????"));
        a6.a(new ndj("([???-??????])???([???-???])???", "$1$2???"));
        a6.a(new ndj("??????", "???"));
        a6.a(new ndj("??????", "???"));
        a6.a(new ndj("??????", "???"));
        a6.a(new ndj("??????", "???"));
        a6.a(new ndj("??????", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("??????+", "???"));
        a6.a(new ndj("([??????])???", "???$1"));
        a6.a(new ndj("([??????])???", "???$1"));
        a6.a(new ndj("??????", "??????"));
        a6.a(new ndj("??????", "??????"));
        a6.a(new ndj("??????", "??????"));
        a6.a(new ndj("??????", "???"));
    }

    public ndk(byte[] bArr) {
        this("Zawgyi to Unicode");
        ndi a = a();
        a.a(new ndj("([???-???])??????", "?????????$1???"));
        a.a(new ndj("([???-???])???", "?????????$1"));
        a.a(new ndj("???", "?????????"));
        a.a(new ndj("([???-???])???", "?????????$1???"));
        a.a(new ndj("([???-???])???", "?????????$1???"));
        a.a(new ndj("([???-???])???", "?????????$1???"));
        a.a(new ndj("([???-???])?????????", "?????????$1?????????"));
        a.a(new ndj("([???-???])??????", "?????????$1??????"));
        a.a(new ndj("([???-???])??????", "?????????$1??????"));
        a.a(new ndj("([???-???])??????", "?????????$1??????"));
        a.a(new ndj("([???-???])??????", "$1?????????"));
        a.a(new ndj("???", "????????????"));
        a.a(new ndj("???", "????????????"));
        a.a(new ndj("???", "????????????"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("[??????]", "???"));
        a.a(new ndj("([??????-???])+", "???"));
        a.a(new ndj("???*???", "??????"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("[??????]", "???"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("???", "???"));
        a.a(new ndj("[??????]", "???"));
        a.a(new ndj("??????", "??????"));
        a.a(new ndj("??????", "?????????"));
        a.a(new ndj("??????", "?????????"));
        a.a(new ndj("??????", "?????????"));
        a.a(new ndj("??????", "?????????"));
        a.a(new ndj("??????", "?????????"));
        a.a(new ndj("??????", "?????????"));
        a.a(new ndj("??????", "?????????"));
        a.a(new ndj("??????", "?????????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("[??????]", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("[??????]", "??????"));
        a.a(new ndj("???", "?????????"));
        a.a(new ndj("[??????]", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("[??????]", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "??????"));
        a.a(new ndj("???", "?????????"));
        a.a(new ndj("???", "?????????"));
        a.a(new ndj("???", "?????????"));
        a.a(new ndj("???", "?????????"));
        a.a(new ndj("???", "?????????"));
        a.a(new ndj("???", "????????????"));
        ndi a2 = a();
        ndj ndjVar = new ndj("???([^???-???])", "???$1");
        ndjVar.a();
        a2.a(ndjVar);
        ndj ndjVar2 = new ndj("???([^???-???])", "???$1");
        ndjVar2.a();
        ndjVar2.d = 0;
        a2.a(ndjVar2);
        a2.a(new ndj("([^???-???])???$", "$1???"));
        a2.a(new ndj("([^???-???])???$", "$1???"));
        a2.a(new ndj("([???-???])???([^???-???])", "$1???$2"));
        a2.a(new ndj("([???-???])???([^???-???])", "$1???$2"));
        ndi a3 = a();
        a3.a(new ndj("([ ??\u1680\u2000-\u200d???\u205f\u2060\u3000\ufeff])???", "???$1"));
        a3.a(new ndj("([ ??\u1680\u2000-\u200d???\u205f\u2060\u3000\ufeff]+)([???-??????-?????????])", "$2"));
        a3.a(new ndj("???+", "???"));
        a3.a(new ndj("???+?????????([???-???])", "?????????$1???"));
        a3.a(new ndj("???+???+([???-???])", "$1??????"));
        a3.a(new ndj("???+???([???-???])", "$1??????"));
        a3.a(new ndj("???+([???-???])([?????????]+)", "$1$2???"));
        a3.a(new ndj("???+([???-???])", "$1???"));
        ndi a4 = a();
        a4.a(new ndj("??????", "??????"));
        a4.a(new ndj("??????", "???"));
        a4.a(new ndj("??????", "??????"));
        a4.a(new ndj("???([???-???]*)([???-??????]+)", "$1$2???"));
        a4.a(new ndj("([????????????])([?????????])", "$2$1"));
        a4.a(new ndj("???([???-???])", "$1???"));
        ndi a5 = a();
        a5.a(new ndj("([???-???])???([???-???])", "???$2$1"));
        a5.a(new ndj("?????????([???-???])", "??????$1???"));
        a5.a(new ndj("???([???-???]+)", "$1???"));
        ndi a6 = a();
        a6.a(new ndj("([???-???]+)???", "???$1"));
        a6.a(new ndj("([??????]+)???", "???$1"));
        a6.a(new ndj("??????", "??????"));
        a6.a(new ndj("([???]+)([???-??????]*)???([???-???])", "???$3$1$2"));
        a6.a(new ndj("([???-??????]+)???([???-???])", "???$2$1"));
        a6.a(new ndj("([???-???]*)([???]+)([???-???]*)", "$1$3$2"));
        a6.a(new ndj("???([???-????????????-???]+)", "$1???"));
        a6.a(new ndj("([???-??????]+)([???-???]+)", "$2$1"));
        a6.a(new ndj("([???-???])([???-?????????-???])???([???-???])", "$1???$2$3"));
        ndi a7 = a();
        a7.a(new ndj("??????", "???"));
        a7.a(new ndj("([???-???])([???-???])", "$2$1"));
        a7.a(new ndj("([???-???])???", "???$1"));
        a7.a(new ndj("([??????])???", "???$1"));
        a7.a(new ndj("??????", "??????"));
        a7.a(new ndj("???([\u000136u???-????????????-???])", "$1???"));
        a7.a(new ndj("??????", "??????"));
        ndi a8 = a();
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("??????+", "???"));
        a8.a(new ndj("???[??????]", "???"));
        a8.a(new ndj("??????", "???"));
        a8.a(new ndj("([ ??\u1680\u2000-\u200d???\u205f\u2060\u3000\ufeff])+([???-??????-???])", "$2"));
        ndj ndjVar3 = new ndj("\u200b+", "");
        ndjVar3.a();
        a8.a(ndjVar3);
        a8.a(new ndj("\u200b+$", ""));
        a8.a(new ndj("[ ??\u1680\u2000-\u200d???\u205f\u2060\u3000\ufeff]*\u200b[ ??\u1680\u2000-\u200d???\u205f\u2060\u3000\ufeff]*", "\u200b"));
    }
}
