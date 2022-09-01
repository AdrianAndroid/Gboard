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
        a.a(new ndj("[ငရၚ]်္([က-အ])ျ", "$1်ၤ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ိံ", "$1ႎ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ိ", "$1ႋ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ီ", "$1ႌ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ံ", "$1ႍ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ေ", "$1ေၤ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ျို", "$1်ဳႋ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ျိ", "$1်ႋ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ျီု", "$1်ႌဳ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ျီ", "$1်ႌ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ျံ", "$1်ႍ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])ြ", "$1ျၤ"));
        a.a(new ndj("[ငရၚ]်္ိ", "ႋ"));
        a.a(new ndj("[ငရၚ]်္ီ", "ႌ"));
        a.a(new ndj("[ငရၚ]်္ံ", "ႍ"));
        a.a(new ndj("[ငရၚ]်္([က-အ])", "$1ၤ"));
        a.a(new ndj("ဥ([ါ-ူဲ])း", "ၪ$1း"));
        a.a(new ndj("ဥုံ", "ဥံဳ"));
        a.a(new ndj("ိံ", "ႎ"));
        a.a(new ndj("ွှ", "ႊ"));
        a.a(new ndj("ှု", "ႈ"));
        a.a(new ndj("ှူ", "ႉ"));
        a.a(new ndj("်", "္"));
        a.a(new ndj("ျ", "်"));
        a.a(new ndj("ြ", "ျ"));
        a.a(new ndj("ွ", "ြ"));
        a.a(new ndj("ှ", "ွ"));
        a.a(new ndj("ဿ", "ႆ"));
        a.a(new ndj("([မ])ှူ", "$1ွဴ"));
        a.a(new ndj("ါ်", "ၚ"));
        a.a(new ndj("္တွ", "႖"));
        a.a(new ndj("္က", "ၠ"));
        a.a(new ndj("္ခ", "ၡ"));
        a.a(new ndj("္ဂ", "ၢ"));
        a.a(new ndj("္ဃ", "ၣ"));
        a.a(new ndj("္စ", "ၥ"));
        a.a(new ndj("္ဆ", "ၧ"));
        a.a(new ndj("္ဇ", "ၨ"));
        a.a(new ndj("္ဈ", "ၩ"));
        a.a(new ndj("္ဋ", "ၬ"));
        a.a(new ndj("္ဌ", "ၭ"));
        a.a(new ndj("္ဏ", "ၰ"));
        a.a(new ndj("္တ", "ၲ"));
        a.a(new ndj("္ထ", "ၴ"));
        a.a(new ndj("္ဒ", "ၵ"));
        a.a(new ndj("္ဓ", "ၶ"));
        a.a(new ndj("္န", "ၷ"));
        a.a(new ndj("္ပ", "ၸ"));
        a.a(new ndj("္ဖ", "ၹ"));
        a.a(new ndj("္ဗ", "ၺ"));
        a.a(new ndj("္ဘ", "႓"));
        a.a(new ndj("္မ", "ၼ"));
        a.a(new ndj("္လ", "ႅ"));
        a.a(new ndj("ဍ္ဍ", "ၮ"));
        a.a(new ndj("ဍ္ဎ", "ၯ"));
        a.a(new ndj("ဏ္ဍ", "႑"));
        a.a(new ndj("ဋ္ဌ", "႒"));
        a.a(new ndj("ဋ္ဋ", "႗"));
        a.a(new ndj("၎င်း", "၎"));
        ndi a2 = a();
        a2.a(new ndj("န([ၠ-ၨၬၭၰ-ၼႅ႓႖])([ိီဲံ္ၤ]*)ျ", "ျႏ$1$2"));
        a2.a(new ndj("နျ([ြွ]*)(ေ*)", "$2ျႏ$1"));
        a2.a(new ndj("([က-အ])ျ([ြွ]*)ေ", "ေျ$1$2"));
        a2.a(new ndj("([က-အ])ျ", "ျ$1"));
        a2.a(new ndj("([က-အ])ွေ့", "ေ$1႔ွ"));
        a2.a(new ndj("([က-အ])(ႊ)ေ", "ေ$1$2"));
        a2.a(new ndj("([က-အ])ၤျ", "ျ$1ၤ"));
        a2.a(new ndj("([က-အ])([်ြွ]+)ေ", "ေ$1$2"));
        a2.a(new ndj("([က-အ])([ၠ-ၨၬၭၰ-ၼႅ႓႖])([ိီဲံ္ၤ]*)ျ", "ျ$1$2$3"));
        a2.a(new ndj("([က-ဪ])ေ", "ေ$1"));
        a2.a(new ndj("န([ၠ-ၨၬၭၰ-ၼႅ႓႖])", "ႏ$1"));
        a2.a(new ndj("န([ုူ့ြွႇ-ႊ])([ိီဲံ္ၤ])့", "ႏ$1$2႔"));
        a2.a(new ndj("န([ိီဲံ္ၤ])([ုူ့ြွႇ-ႊ])့", "ႏ$1$2႔"));
        a2.a(new ndj("န([ိီဲံ္ၤ])့", "န$1႔"));
        a2.a(new ndj("နဲ့", "နဲ႔"));
        a2.a(new ndj("န့", "န႔"));
        a2.a(new ndj("နဲ([ုူ့ြွႇ-ႊ])့", "ႏ$1ဲ႔"));
        a2.a(new ndj("န([ိီဲံ္ၤ])([ုူ့ြွႇ-ႊ])", "ႏ$1$2"));
        a2.a(new ndj("န([ုူ့ြွႇ-ႊ])([ိီဲံ္ၤ])", "ႏ$1$2"));
        a2.a(new ndj("န([ုူ့ြွႇ-ႊ])့", "ႏ$1႔"));
        a2.a(new ndj("န([ုူ့ြွႇ-ႊ])", "ႏ$1"));
        a2.a(new ndj("([ုူ့ြွႇ-ႊ])([ိီဲံ္ၤ]*)့", "$1$2႔"));
        a2.a(new ndj("([^၀-၉])၀([ါ-ဿ])", "$1ဝ$2"));
        a2.a(new ndj("([^၀-၉])၎", "$1၄"));
        a2.a(new ndj("ေ၀([^၀-၉])", "ေဝ$1"));
        a2.a(new ndj("ဉ်", "ဥ်"));
        a2.a(new ndj("ဦ", "ဦ"));
        a2.a(new ndj("့်", "့်"));
        a2.a(new ndj("([ါာုူ])([ိီဲ])", "$2$1"));
        ndi a3 = a();
        a3.a(new ndj("်ြ", "ြၽ"));
        a3.a(new ndj("ြ႔", "ြ႕"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])([ၠ-ၨၬၭၰ-ၼႅ႓႖])([ိီဲံ္ၤ])", "ႃ$1$2$3"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])([ၠ-ၨၬၭၰ-ၼႅ႓႖])([ိီဲံ္ၤ])", "ႄ$1$2$3"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])([ၠ-ၨၬၭၰ-ၼႅ႓႖])", "ႁ$1$2"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])([ၠ-ၨၬၭၰ-ၼႅ႓႖])", "ႂ$1$2"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])([ြႊ])([ိီဲံ္ၤ])", "ႃ$1$2$3"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])([ြႊ])([ိီဲံ္ၤ])", "ႄ$1$2$3"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])ွ([ိီဲံ္ၤ])", "ၿ$1ႇ$2"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])ွ([ိီဲံ္ၤ])", "ႀ$1ႇ$2"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])ု([ိီဲံ္ၤ])", "ၿ$1ဳ$2"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])ု([ိီဲံ္ၤ])", "ႀ$1ဳ$2"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])ူ([ိီဲံ္ၤ])", "ၿ$1ဴ$2"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])ူ([ိီဲံ္ၤ])", "ႀ$1ဴ$2"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])([ုူ့ြွႇ-ႊ]*)([ိီဲံ္ၤ])", "ၿ$1$2$3"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])([ုူ့ြွႇ-ႊ]*)([ိီဲံ္ၤ])", "ႀ$1$2$3"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])([ြႊ])", "ႁ$1$2"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])([ြႊ])", "ႂ$1$2"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])ွ", "ျ$1ႇ"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])ွ", "ၾ$1ႇ"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])ု", "ျ$1ဳ"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])ု", "ၾ$1ဳ"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])ူ", "ျ$1ဴ"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])ူ", "ၾ$1ဴ"));
        a3.a(new ndj("[ျၾ-ႄ]([ညၫ])", "ႂ$1"));
        a3.a(new ndj("[ျၾ-ႄ]([ဉၪ])", "ျၪ"));
        a3.a(new ndj("[ျၾ-ႄ]([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])", "ျ$1"));
        a3.a(new ndj("[ျၾ-ႄ]([ကဃဆဉညဏ-ထဘလသဟအ])", "ၾ$1"));
        a3.a(new ndj("ဉ([ုူ့ြွႇ-ႊ])", "ၪ$1"));
        a3.a(new ndj("ည([ုူ့ြွႇ-ႊ])", "ၫ$1"));
        a3.a(new ndj("ွိ", "ိွ"));
        a3.a(new ndj("်([ိီဲံ္ၤ])ု[့႔႕]", "်$1ဳ႕"));
        a3.a(new ndj("်ု[့႔႕]", "်ဳ႕"));
        a3.a(new ndj("်ု", "်ဳ"));
        a3.a(new ndj("ၤီ", "ႌ"));
        ndi a4 = a();
        a4.a(new ndj("့([ိ-ူဲံ])", "$1့"));
        a4.a(new ndj("([က-အ])([ါ-ဲံျ-ှ])်([က-အ])", "$1်$2$3"));
        a4.a(new ndj("ွု", "ႈ"));
        a4.a(new ndj("ဳ႔", "ဳ႕"));
        a4.a(new ndj("([ျၾ-ႄ])([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])([ုူ့ြွႇ-ႊ]*)([ိီဲံ္ၤ]*)ု", "$1$2$3$4ဳ"));
        a4.a(new ndj("([ျၾ-ႄ])([ကဃဆဉညဏ-ထဘလသဟအ])([ုူ့ြွႇ-ႊ]*)([ိီဲံ္ၤ]*)ု", "$1$2$3$4ဳ"));
        a4.a(new ndj("([ျၾ-ႄ])([ခဂငစဇဋ-ဎဒဓပ-ဗမဝဠဥဦႏ])([ုူ့ြွႇ-ႊ]*)([ိီဲံ္ၤ]*)ူ", "$1$2$3$4ဴ"));
        a4.a(new ndj("([ျၾ-ႄ])([ကဃဆဉညဏ-ထဘလသဟအ])([ုူ့ြွႇ-ႊ]*)([ိီဲံ္ၤ]*)ူ", "$1$2$3$4ဴ"));
        ndi a5 = a();
        a5.a(new ndj("([ွှ])ြ", "ြ$1"));
        a5.a(new ndj("ှွ", "ွှ"));
        a5.a(new ndj("း([ါ-ူဲြ-ဿ])", "$1း"));
        a5.a(new ndj("း([ံ့်])", "$1း"));
        a5.a(new ndj("်([ၤႋ-ႎ])ို", "်$1ိဳ"));
        a5.a(new ndj("်ို", "်ိဳ"));
        ndi a6 = a();
        a6.a(new ndj("([က-အ])ျ်", "$1်ျ"));
        a6.a(new ndj("([ြ-ှ])ျ", "ျ$1"));
        a6.a(new ndj("([ွှ])ြ", "ြ$1"));
        a6.a(new ndj("ှွ", "ွှ"));
        a6.a(new ndj("([ိ-ူဲ])်([က-အ])်", "$1$2်"));
        a6.a(new ndj("ိ်", "ိ"));
        a6.a(new ndj("ီ်", "ီ"));
        a6.a(new ndj("ု်", "ု"));
        a6.a(new ndj("ိီ", "ီ"));
        a6.a(new ndj("ုူ", "ု"));
        a6.a(new ndj("ါါ+", "ါ"));
        a6.a(new ndj("ာာ+", "ာ"));
        a6.a(new ndj("ိိ+", "ိ"));
        a6.a(new ndj("ီီ+", "ီ"));
        a6.a(new ndj("ုု+", "ု"));
        a6.a(new ndj("ူူ+", "ူ"));
        a6.a(new ndj("ေေ+", "ေ"));
        a6.a(new ndj("ဲဲ+", "ဲ"));
        a6.a(new ndj("ံံ+", "ံ"));
        a6.a(new ndj("််+", "်"));
        a6.a(new ndj("ျျ+", "ျ"));
        a6.a(new ndj("ြြ+", "ြ"));
        a6.a(new ndj("ွွ+", "ွ"));
        a6.a(new ndj("ှှ+", "ှ"));
        a6.a(new ndj("([ုဳ])ိ", "ိ$1"));
        a6.a(new ndj("([ုဳ])ံ", "ံ$1"));
        a6.a(new ndj("့္", "့္"));
        a6.a(new ndj("ဲြ", "ြဲ"));
        a6.a(new ndj("ီြ", "ြီ"));
        a6.a(new ndj("ွႈ", "ႈ"));
    }

    public ndk(byte[] bArr) {
        this("Zawgyi to Unicode");
        ndi a = a();
        a.a(new ndj("([က-အ])်ၤ", "င်္$1ျ"));
        a.a(new ndj("([က-အ])ၤ", "င်္$1"));
        a.a(new ndj("ၤ", "င်္"));
        a.a(new ndj("([က-အ])ႋ", "င်္$1ိ"));
        a.a(new ndj("([က-အ])ႌ", "င်္$1ီ"));
        a.a(new ndj("([က-အ])ႍ", "င်္$1ံ"));
        a.a(new ndj("([က-အ])်ဳႋ", "င်္$1ျို"));
        a.a(new ndj("([က-အ])်ႋ", "င်္$1ျိ"));
        a.a(new ndj("([က-အ])်ႌ", "င်္$1ျီ"));
        a.a(new ndj("([က-အ])်ႍ", "င်္$1ျံ"));
        a.a(new ndj("([က-အ])်ႎ", "$1ျိံ"));
        a.a(new ndj("ႋ", "င်္ိ"));
        a.a(new ndj("ႌ", "င်္ီ"));
        a.a(new ndj("ႍ", "င်္ံ"));
        a.a(new ndj("ၪ", "ဉ"));
        a.a(new ndj("ၫ", "ည"));
        a.a(new ndj("ႏ", "န"));
        a.a(new ndj("႐", "ရ"));
        a.a(new ndj("ႆ", "ဿ"));
        a.a(new ndj("[်ၽ]", "ျ"));
        a.a(new ndj("([ျၾ-ႄ])+", "ြ"));
        a.a(new ndj("ြ*ႊ", "ွှ"));
        a.a(new ndj("ြ", "ွ"));
        a.a(new ndj("[ွႇ]", "ှ"));
        a.a(new ndj("ႈ", "ှု"));
        a.a(new ndj("ႉ", "ှူ"));
        a.a(new ndj("ဳ", "ု"));
        a.a(new ndj("ဴ", "ူ"));
        a.a(new ndj("္", "်"));
        a.a(new ndj("[႔႕]", "့"));
        a.a(new ndj("ဥ္", "ဉ်"));
        a.a(new ndj("ဥၡ", "ဉ္ခ"));
        a.a(new ndj("ဥၢ", "ဉ္ဂ"));
        a.a(new ndj("ဥၥ", "ဉ္စ"));
        a.a(new ndj("ဥၨ", "ဉ္ဇ"));
        a.a(new ndj("ဥၶ", "ဉ္ဓ"));
        a.a(new ndj("ဥၸ", "ဉ္ပ"));
        a.a(new ndj("ဥၺ", "ဉ္ဗ"));
        a.a(new ndj("ဥၹ", "ဉ္ဖ"));
        a.a(new ndj("ၚ", "ါ်"));
        a.a(new ndj("ၠ", "္က"));
        a.a(new ndj("ၡ", "္ခ"));
        a.a(new ndj("ၢ", "္ဂ"));
        a.a(new ndj("ၣ", "္ဃ"));
        a.a(new ndj("ၥ", "္စ"));
        a.a(new ndj("[ၦၧ]", "္ဆ"));
        a.a(new ndj("ၨ", "္ဇ"));
        a.a(new ndj("ၩ", "္ဈ"));
        a.a(new ndj("ၬ", "္ဋ"));
        a.a(new ndj("ၭ", "္ဌ"));
        a.a(new ndj("ၰ", "္ဏ"));
        a.a(new ndj("[ၱၲ]", "္တ"));
        a.a(new ndj("႖", "္တွ"));
        a.a(new ndj("[ၳၴ]", "္ထ"));
        a.a(new ndj("ၵ", "္ဒ"));
        a.a(new ndj("ၶ", "္ဓ"));
        a.a(new ndj("ၷ", "္န"));
        a.a(new ndj("ၸ", "္ပ"));
        a.a(new ndj("ၹ", "္ဖ"));
        a.a(new ndj("ၺ", "္ဗ"));
        a.a(new ndj("[ၻ႓]", "္ဘ"));
        a.a(new ndj("ၼ", "္မ"));
        a.a(new ndj("ႅ", "္လ"));
        a.a(new ndj("ႎ", "ိံ"));
        a.a(new ndj("ၮ", "ဍ္ဍ"));
        a.a(new ndj("ၯ", "ဍ္ဎ"));
        a.a(new ndj("႑", "ဏ္ဍ"));
        a.a(new ndj("႒", "ဋ္ဌ"));
        a.a(new ndj("႗", "ဋ္ဋ"));
        a.a(new ndj("၎", "၎င်း"));
        ndi a2 = a();
        ndj ndjVar = new ndj("၀([^၀-၉])", "ဝ$1");
        ndjVar.a();
        a2.a(ndjVar);
        ndj ndjVar2 = new ndj("၄([^၀-၉])", "၎$1");
        ndjVar2.a();
        ndjVar2.d = 0;
        a2.a(ndjVar2);
        a2.a(new ndj("([^၀-၉])၀$", "$1ဝ"));
        a2.a(new ndj("([^၀-၉])၄$", "$1၎"));
        a2.a(new ndj("([ါ-ဿ])၀([^၀-၉])", "$1ဝ$2"));
        a2.a(new ndj("([ါ-ဿ])၄([^၀-၉])", "$1၎$2"));
        ndi a3 = a();
        a3.a(new ndj("([  \u1680\u2000-\u200d \u205f\u2060\u3000\ufeff])့", "့$1"));
        a3.a(new ndj("([  \u1680\u2000-\u200d \u205f\u2060\u3000\ufeff]+)([ါ-ူဲ-ျွှ])", "$2"));
        a3.a(new ndj("့+", "့"));
        a3.a(new ndj("ေ+င်္([က-အ])", "င်္$1ေ"));
        a3.a(new ndj("ေ+့+([က-အ])", "$1ေ့"));
        a3.a(new ndj("ေ+ြ([က-အ])", "$1ြေ"));
        a3.a(new ndj("ေ+([က-အ])([ျွှ]+)", "$1$2ေ"));
        a3.a(new ndj("ေ+([က-ဪ])", "$1ေ"));
        ndi a4 = a();
        a4.a(new ndj("ျ်", "်ျ"));
        a4.a(new ndj("ဦ", "ဦ"));
        a4.a(new ndj("့်", "့်"));
        a4.a(new ndj("ံ([ျ-ှ]*)([ါ-ူဲ]+)", "$1$2ံ"));
        a4.a(new ndj("([ါာုူ])([ိီဲ])", "$2$1"));
        a4.a(new ndj("ြ([က-အ])", "$1ြ"));
        ndi a5 = a();
        a5.a(new ndj("([ျ-ှ])္([က-အ])", "္$2$1"));
        a5.a(new ndj("ြ်္([က-အ])", "်္$1ြ"));
        a5.a(new ndj("ံ([ျ-ှ]+)", "$1ံ"));
        ndi a6 = a();
        a6.a(new ndj("([ြ-ှ]+)ျ", "ျ$1"));
        a6.a(new ndj("([ွှ]+)ြ", "ြ$1"));
        a6.a(new ndj("ှွ", "ွှ"));
        a6.a(new ndj("([ေ]+)([ါ-ူဲ]*)္([က-အ])", "္$3$1$2"));
        a6.a(new ndj("([ါ-ူဲ]+)္([က-အ])", "္$2$1"));
        a6.a(new ndj("([ျ-ှ]*)([ေ]+)([ျ-ှ]*)", "$1$3$2"));
        a6.a(new ndj("့([ိ-ူဲံျ-ှ]+)", "$1့"));
        a6.a(new ndj("([ါ-ူဲ]+)([ျ-ှ]+)", "$2$1"));
        a6.a(new ndj("([က-အ])([ါ-ဲံျ-ှ])်([က-အ])", "$1်$2$3"));
        ndi a7 = a();
        a7.a(new ndj("စျ", "ဈ"));
        a7.a(new ndj("([ါ-ဲ])([ျ-ှ])", "$2$1"));
        a7.a(new ndj("([ြ-ှ])ျ", "ျ$1"));
        a7.a(new ndj("([ွှ])ြ", "ြ$1"));
        a7.a(new ndj("ှွ", "ွှ"));
        a7.a(new ndj("း([\u000136uါ-ူဲ့်-ဿ])", "$1း"));
        a7.a(new ndj("ံု", "ုံ"));
        ndi a8 = a();
        a8.a(new ndj("ိိ+", "ိ"));
        a8.a(new ndj("ီီ+", "ီ"));
        a8.a(new ndj("ုု+", "ု"));
        a8.a(new ndj("ူူ+", "ူ"));
        a8.a(new ndj("ဲဲ+", "ဲ"));
        a8.a(new ndj("ံံ+", "ံ"));
        a8.a(new ndj("့့+", "့"));
        a8.a(new ndj("္္+", "္"));
        a8.a(new ndj("််+", "်"));
        a8.a(new ndj("ျျ+", "ျ"));
        a8.a(new ndj("ြြ+", "ြ"));
        a8.a(new ndj("ွွ+", "ွ"));
        a8.a(new ndj("ှှ+", "ှ"));
        a8.a(new ndj("ု[ူ်]", "ု"));
        a8.a(new ndj("ိီ", "ီ"));
        a8.a(new ndj("([  \u1680\u2000-\u200d \u205f\u2060\u3000\ufeff])+([ါ-ဲံ-ှ])", "$2"));
        ndj ndjVar3 = new ndj("\u200b+", "");
        ndjVar3.a();
        a8.a(ndjVar3);
        a8.a(new ndj("\u200b+$", ""));
        a8.a(new ndj("[  \u1680\u2000-\u200d \u205f\u2060\u3000\ufeff]*\u200b[  \u1680\u2000-\u200d \u205f\u2060\u3000\ufeff]*", "\u200b"));
    }
}
