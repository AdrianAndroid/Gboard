package defpackage;

import java.util.StringTokenizer;

/* compiled from: PG */
/* renamed from: dqw  reason: default package */
/* loaded from: classes.dex */
public final class dqw {
    private static final lmz a = lmz.w("ひらがな", "数字", "丸数字", "大字", "絵文字", "顔文字", "<機種依存>", "捨て仮名");
    private static final String[] b = {"の旧字体", "の簡易慣用字体", "の印刷標準字体", "の俗字", "の正字", "の本字", "の異体字", "の略字", "の別字"};
    private static final llw c;

    static {
        lls h = llw.h();
        h.a("小書き文字", "小書き");
        h.a("ローマ数字(大文字)", "ローマ数字");
        h.a("ローマ数字(小文字)", "ローマ数字");
        c = h.l();
    }

    public static llp a(String str) {
        jdg.u(str);
        if (str.length() == 0) {
            return llp.q();
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " \t\n\r\f");
        llk e = llp.e();
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (!((Boolean) dqq.q.c()).booleanValue() || !nextToken.equals("部分")) {
                if (!a.contains(nextToken)) {
                    String[] strArr = b;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < 9) {
                            if (!nextToken.endsWith(strArr[i])) {
                                i++;
                            }
                        } else {
                            jdg.u(nextToken);
                            e.h((String) jdg.U((String) c.get(nextToken), nextToken));
                            break;
                        }
                    }
                }
            }
        }
        return e.g();
    }
}
