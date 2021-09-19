package xyz.mlserver.mc.util.version;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.mlserver.mc.util.version.test.IgnoreTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings({ "unused", "RedundantSuppression" })
public enum MCVersion {

    /*
        参考サイト
        https://minecraft.fandom.com/wiki/Protocol_version#Java_Edition
    */

    @IgnoreTest("marker version (not released yet)")

    v1_18                        (1,          1,    true,       "1.18"), // not released; set to release in late 2021. Caves & Cliffs: Part II

    SNAPSHOT_21W37A              (0x40000029, 2834, true, v1_18,"21w37a"),
    v1_18_EXPERIMENTAL_SNAPSHOT_7(0x4000002F, 2831, true, v1_18,"1.18_experimental-snapshot-7"),
    v1_18_EXPERIMENTAL_SNAPSHOT_6(0x4000002E, 2830, true, v1_18,"1.18_experimental-snapshot-6"),
    v1_18_EXPERIMENTAL_SNAPSHOT_5(0x4000002D, 2829, true, v1_18,"1.18_experimental-snapshot-5"),
    v1_18_EXPERIMENTAL_SNAPSHOT_4(0x4000002C, 2828, true, v1_18,"1.18_experimental-snapshot-4"),
    v1_18_EXPERIMENTAL_SNAPSHOT_3(0x4000002B, 2827, true, v1_18,"1.18_experimental-snapshot-3"),
    v1_18_EXPERIMENTAL_SNAPSHOT_2(0x4000002A, 2826, true, v1_18,"1.18_experimental-snapshot-2"),
    v1_18_EXPERIMENTAL_SNAPSHOT_1(0x40000029, 2825, true, v1_18,"1.18_experimental-snapshot-1"),

    v1_17_1     (756,        2730, true,         "1.17.1"),
    v1_17_1_RC2 (0x40000028, 2729, true, v1_17_1,"1.17.1-rc2"),
    v1_17_1_RC1 (0x40000027, 2728, true, v1_17_1,"1.17.1-rc1"),
    v1_17_1_PRE3(0x40000026, 2727, true, v1_17_1,"1.17.1-pre3"),
    v1_17_1_PRE2(0x40000025, 2726, true, v1_17_1,"1.17.1-pre2"),
    v1_17_1_PRE1(0x40000024, 2725, true, v1_17_1,"1.17.1-pre1"),

    v1_17          (755,        2724, true,        "1.17"), // unreleased
    v1_17_RC2      (0x40000023, 2723, true, v1_17, "1.17-rc2"),
    v1_17_RC1      (0x40000022, 2722, true, v1_17, "1.17-rc1"),
    v1_17_PRE5     (0x40000021, 2721, true, v1_17, "1.17-pre5"),
    v1_17_PRE4     (0x40000020, 2720, true, v1_17, "1.17-pre4"),
    v1_17_PRE3     (0x4000001F, 2719, true, v1_17, "1.17-pre3"),
    v1_17_PRE2     (0x4000001E, 2718, true, v1_17, "1.17-pre2"),
    v1_17_PRE1     (0x4000001D, 2716, true, v1_17, "1.17-pre1"),
    SNAPSHOT_21W20A(0x4000001C, 2715, true, v1_17, "21w20a"),
    SNAPSHOT_21W19A(0x4000001B, 2714, true, v1_17, "21w19a"),
    SNAPSHOT_21W18A(0x4000001A, 2713, true, v1_17, "21w18a"),
    SNAPSHOT_21W17A(0x40000019, 2712, true, v1_17, "21w17a"),
    SNAPSHOT_21W16A(0x40000017, 2711, true, v1_17, "21w16a"),
    SNAPSHOT_21W15A(0x40000016, 2709, true, v1_17, "21w15a"),
    SNAPSHOT_21W14A(0x40000015, 2706, true, v1_17, "21w14a"),
    SNAPSHOT_21W13A(0x40000014, 2705, true, v1_17, "21w13a"),
    SNAPSHOT_21W11A(0x40000013, 2703, true, v1_17, "21w11a"),
    SNAPSHOT_21W10A(0x40000012, 2699, true, v1_17, "21w10a"),
    SNAPSHOT_21W08B(0x40000011, 2698, true, v1_17, "21w08b"),
    SNAPSHOT_21W08A(0x40000010, 2697, true, v1_17, "21w08a"),
    SNAPSHOT_21W07A(0x4000000F, 2695, true, v1_17, "21w07a"),
    SNAPSHOT_21W06A(0x4000000E, 2694, true, v1_17, "21w06a"),
    SNAPSHOT_21W05B(0x4000000D, 2692, true, v1_17, "21w05b"),
    SNAPSHOT_21W05A(0x4000000C, 2690, true, v1_17, "21w05a"),
    SNAPSHOT_21W03A(0x4000000B, 2689, true, v1_17, "21w03a"),
    SNAPSHOT_20W51A(0x40000009, 2687, true, v1_17, "20w51a"),
    SNAPSHOT_20W49A(0x40000008, 2685, true, v1_17, "20w49a"),
    SNAPSHOT_20W48A(0x40000007, 2683, true, v1_17, "20w48a"),
    SNAPSHOT_20W46A(0x40000006, 2682, true, v1_17, "20w46a"),
    SNAPSHOT_20W45A(0x40000005, 2681, true, v1_17, "20w45a"),

    v1_16_5    (754, 2586, true, "1.16.5"),
    v1_16_5_RC1(0x4000000A, 2585, true, v1_16_5, "1.16.5-rc1"),

    v1_16_4     (754,        2584, true, "1.16.4"),
    v1_16_4_RC1 (0x40000003, 2583, true, "1.16.4-rc1"),
    v1_16_4_PRE2(0x40000002, 2582, true, "1.16.4-pre2"),
    v1_16_4_PRE1(0x40000001, 2581, true, "1.16.4-pre1"), // New network protocol scheme, with a high bit (bit 30) set for snapshots.

    v1_16_3    (753, 2580, true,          "1.16.3"),
    v1_16_3_RC1(752, 2579, true, v1_16_3, "1.16.3-rc1"),

    v1_16_2        (751, 2578, true,          "1.16.2"),
    v1_16_2_RC2    (750, 2577, true, v1_16_2, "1.16.2-rc2"),
    v1_16_2_RC1    (749, 2576, true, v1_16_2, "1.16.2-rc1"),
    v1_16_2_PRE3   (748, 2575, true, v1_16_2, "1.16.2-pre3"),
    v1_16_2_PRE2   (746, 2574, true, v1_16_2, "1.16.2-pre2"),
    v1_16_2_PRE1   (744, 2573, true, v1_16_2, "1.16.2-pre1"),
    SNAPSHOT_20W30A(742, 2572, true, v1_16_2, "20w30a"),
    SNAPSHOT_20W29A(741, 2571, true, v1_16_2, "20w29a"),
    SNAPSHOT_20W28A(740, 2570, true, v1_16_2, "20w28a"),
    SNAPSHOT_20W27A(738, 2569, true, v1_16_2, "20w27a"),

    v1_16_1(736, 2567, true, "1.16.1"),

    v1_16          (735, 2566, true, "1.16"),
    v1_16_RC1      (734, 2565, true, v1_16, "1.16-rc1"),
    v1_16_PRE8     (733, 2564, true, v1_16, "1.16-pre8"),
    v1_16_PRE7     (732, 2563, true, v1_16, "1.16-pre7"),
    v1_16_PRE6     (730, 2562, true, v1_16, "1.16-pre6"),
    v1_16_PRE5     (729, 2561, true, v1_16, "1.16-pre5"),
    v1_16_PRE4     (727, 2560, true, v1_16, "1.16-pre4"),
    v1_16_PRE3     (725, 2559, true, v1_16, "1.16-pre3"),
    v1_16_PRE2     (722, 2557, true, v1_16, "1.16-pre2"),
    v1_16_PRE1     (721, 2556, true, v1_16, "1.16-pre1"),
    SNAPSHOT_20W22A(719, 2555, true, v1_16, "20w22a"),
    SNAPSHOT_20W21A(718, 2554, true, v1_16, "20w21a"),
    SNAPSHOT_20W20B(717, 2537, true, v1_16, "20w20b"),
    SNAPSHOT_20W20A(716, 2536, true, v1_16, "20w20a"),
    SNAPSHOT_20W19A(715, 2534, true, v1_16, "20w19a"),
    SNAPSHOT_20W18A(714, 2532, true, v1_16, "20w18a"),
    SNAPSHOT_20W17A(713, 2529, true, v1_16, "20w17a"),
    SNAPSHOT_20W16A(712, 2526, true, v1_16, "20w16a"),
    SNAPSHOT_20W15A(711, 2525, true, v1_16, "20w15a"),
    SNAPSHOT_20W14A(710, 2524, true, v1_16, "20w14a"),
    SNAPSHOT_20W14 (709, 2522, true, null, true, "20w14∞"), // april fool
    SNAPSHOT_20W13B(709, 2521, true, v1_16, "20w13b"),
    SNAPSHOT_20W13A(708, 2520, true, v1_16, "20w13a"),
    SNAPSHOT_20W12A(707, 2515, true, v1_16, "20w12a"),
    SNAPSHOT_20W11A(706, 2513, true, v1_16, "20w11a"),
    SNAPSHOT_20W10A(705, 2512, true, v1_16, "20w10a"),
    SNAPSHOT_20W09A(704, 2510, true, v1_16, "20w09a"),
    SNAPSHOT_20W08A(703, 2507, true, v1_16, "20w08a"),
    SNAPSHOT_20W07A(702, 2506, true, v1_16, "20w07a"),
    SNAPSHOT_20W06A(701, 2504, true, v1_16, "20w06a"),

    v1_15_2(578, 2230, true, "1.15.2"),
    v1_15_2_PRE2(577, 2229, true, v1_15_2, "1.15.2-pre2"),
    v1_15_2_PRE1(576, 2228, true, v1_15_2, "1.15.2-pre1"),
    v1_15_1(575, 2227, true, "1.15.1"),
    v1_15_1_PRE1(574, 2226, true, v1_15_1, "1.15.1-pre1"),
    v1_15(573, 2225, true, "1.15"),
    v1_15_PRE7(572, 2224, true, v1_15, "1.15-pre7"),
    v1_15_PRE6(571, 2223, true, v1_15, "1.15-pre6"),
    v1_15_PRE5(570, 2222, true, v1_15, "1.15-pre5"),
    v1_15_PRE4(569, 2221, true, v1_15, "1.15-pre4"),
    v1_15_PRE3(567, 2220, true, v1_15, "1.15-pre3"),
    v1_15_PRE2(566, 2219, true, v1_15, "1.15-pre2"),
    v1_15_PRE1(565, 2218, true, v1_15, "1.15-pre1"),
    SNAPSHOT_19W46B(564, 2217, true, v1_15, "19w46b"),
    SNAPSHOT_19W46A(563, 2216, true, v1_15, "19w46a"),
    SNAPSHOT_19W45B(562, 2215, true, v1_15, "19w45b"),
    SNAPSHOT_19W45A(561, 2214, true, v1_15, "19w45a"),
    SNAPSHOT_19W44A(560, 2213, true, v1_15, "19w44a"),
    SNAPSHOT_19W42A(559, 2212, true, v1_15, "19w42a"),
    SNAPSHOT_19W41A(558, 2210, true, v1_15, "19w41a"),
    SNAPSHOT_19W40A(557, 2208, true, v1_15, "19w40a"),
    SNAPSHOT_19W39A(556, 2207, true, v1_15, "19w39a"),
    SNAPSHOT_19W38B(555, 2206, true, v1_15, "19w38b"),
    SNAPSHOT_19W38A(554, 2205, true, v1_15, "19w18a"),
    SNAPSHOT_19W37A(553, 2204, true, v1_15, "19w37a"),
    SNAPSHOT_19W36A(552, 2203, true, v1_15, "19w36a"),
    SNAPSHOT_19W35A(551, 2201, true, v1_15, "19w35a"),
    SNAPSHOT_19W34A(550, 2200, true, v1_15, "19w34a"),
    v1_14_4(498, 1976, true, "1.14.4"),
    v1_14_4_PRE7(497, 1975, true, v1_14_4, "1.14.4-pre7"),
    v1_14_4_PRE6(496, 1974, true, v1_14_4, "1.14.4-pre6"),
    v1_14_4_PRE5(495, 1973, true, v1_14_4, "1.14.4-pre5"),
    v1_14_4_PRE4(494, 1972, true, v1_14_4, "1.14.4-pre4"),
    v1_14_4_PRE3(493, 1971, true, v1_14_4, "1.14.4-pre3"),
    v1_14_4_PRE2(492, 1970, true, v1_14_4, "1.14.4-pre2"),
    v1_14_4_PRE1(491, 1969, true, v1_14_4, "1.14.4-pre1"),
    v1_14_3(490, 1968, true, "1.14.3"),
    v1_14_3_PRE4(489, 1967, true, v1_14_3, "1.14.3-pre4"),
    v1_14_3_PRE3(488, 1966, true, v1_14_3, "1.14.3-pre3"),
    v1_14_3_PRE2(487, 1965, true, v1_14_3, "1.14.3-pre2"),
    v1_14_3_PRE1(486, 1964, true, v1_14_3, "1.14.3-pre1"),
    v1_14_2(485, 1963, true, "1.14.2"),
    v1_14_2_PRE4(484, 1962, true, v1_14_2, "1.14.2-pre4"),
    v1_14_2_PRE3(483, 1960, true, v1_14_2, "1.14.2-pre3"),
    v1_14_2_PRE2(482, 1959, true, v1_14_2, "1.14.2-pre2"),
    v1_14_2_PRE1(481, 1958, true, v1_14_2, "1.14.2-pre1"),
    v1_14_1(480, 1957, true, "1.14.1"),
    v1_14_1_PRE2(479, 1956, true, v1_14_1, "1.14.1-pre2"),
    v1_14_1_PRE1(478, 1955, true, v1_14_1, "1.14.1-pre1"),
    v1_14(477, 1952, true, "1.14"),
    v1_14_PRE5(476, 1951, true, v1_14, "1.14-pre5"),
    v1_14_PRE4(475, 1950, true, v1_14, "1.14-pre4"),
    v1_14_PRE3(474, 1949, true, v1_14, "1.14-pre3"),
    v1_14_PRE2(473, 1948, true, v1_14, "1.14-pre2"),
    v1_14_PRE1(472, 1947, true, v1_14, "1.14-pre1"),
    SNAPSHOT_19W14B(471, 1945, true, v1_14, "19w14b"),
    SNAPSHOT_19W14A(470, 1944, true, v1_14, "19w14a"),
    @IgnoreTest("Protocol version is 1 on this april fool version")
    MC_3D_SHAREWARE_v1_34(1, 1943, true, null, true, "3D Shareware v1.34"), // april fools
    SNAPSHOT_19W13B(469, 1943, true, v1_14, "19w13b"),
    SNAPSHOT_19W13A(468, 1942, true, v1_14, "19w13a"),
    SNAPSHOT_19W12B(467, 1941, true, v1_14, "19w12b"),
    SNAPSHOT_19W12A(466, 1940, true, v1_14, "19w12a"),
    SNAPSHOT_19W11B(465, 1938, true, v1_14, "19w11b"),
    SNAPSHOT_19W11A(464, 1937, true, v1_14, "19w11a"),
    SNAPSHOT_19W09A(463, 1935, true, v1_14, "19w09a"),
    SNAPSHOT_19W08B(462, 1934, true, v1_14, "19w08b"),
    SNAPSHOT_19W08A(461, 1933, true, v1_14, "19w08a"),
    SNAPSHOT_19W07A(460, 1932, true, v1_14, "19w07a"),
    SNAPSHOT_19W06A(459, 1931, true, v1_14, "19w06a"),
    SNAPSHOT_19W05A(458, 1930, true, v1_14, "19w05a"),
    SNAPSHOT_19W04B(457, 1927, true, v1_14, "19w04b"),
    SNAPSHOT_19W04A(456, 1926, true, v1_14, "19w04a"),
    SNAPSHOT_19W03C(455, 1924, true, v1_14, "19w03c"),
    SNAPSHOT_19W03B(454, 1923, true, v1_14, "19w03b"),
    SNAPSHOT_19W03A(453, 1922, true, v1_14, "19w03a"),
    SNAPSHOT_19W02A(452, 1921, true, v1_14, "19w02a"),
    SNAPSHOT_18W50A(451, 1919, true, v1_14, "18w50a"),
    SNAPSHOT_18W49A(450, 1916, true, v1_14, "18w49a"),
    SNAPSHOT_18W48B(449, 1915, true, v1_14, "18w48b"),
    SNAPSHOT_18W48A(448, 1914, true, v1_14, "18w48a"),
    SNAPSHOT_18W47B(447, 1913, true, v1_14, "18w47b"),
    SNAPSHOT_18W47A(446, 1912, true, v1_14, "18w47a"),
    SNAPSHOT_18W46A(445, 1910, true, v1_14, "18w46a"),
    SNAPSHOT_18W45A(444, 1908, true, v1_14, "18w45a"),
    SNAPSHOT_18W44A(443, 1907, true, v1_14, "18w44a"),
    SNAPSHOT_18W43C(442, 1903, true, v1_14, "18w43c"),
    SNAPSHOT_18W43B(441, 1902, true, v1_14, "18w43b"),
    SNAPSHOT_18W43A(440, 1901, true, v1_14, "18w43a"),
    v1_13_2(404, 1631, true, "1.13.2"),
    v1_13_2_PRE2(403, 1630, true, v1_13_2, "1.13.2-pre2"),
    v1_13_2_PRE1(402, 1629, true, v1_13_2, "1.13.2-pre1"),
    v1_13_1(401, 1628, true, "1.13.1"),
    v1_13_1_PRE2(400, 1627, true, v1_13_1, "1.13.1-pre2"),
    v1_13_1_PRE1(399, 1626, true, v1_13_1, "1.13.1-pre1"),
    SNAPSHOT_18W33A(398, 1625, true, v1_13_1, "18w33a"),
    SNAPSHOT_18W32A(397, 1623, true, v1_13_1, "18w32a"),
    SNAPSHOT_18W31A(396, 1622, true, v1_13_1, "18w31a"),
    SNAPSHOT_18W30B(395, 1621, true, v1_13_1, "18w30b"),
    SNAPSHOT_18W30A(394, 1620, true, v1_13_1, "18w30a"),
    v1_13(393, 1519, true, "1.13"),
    v1_13_PRE10(392, 1518, true, v1_13, "1.13-pre10"),
    v1_13_PRE9(391, 1517, true, v1_13, "1.13-pre9"),
    v1_13_PRE8(390, 1516, true, v1_13, "1.13-pre8"),
    v1_13_PRE7(389, 1513, true, v1_13, "1.13-pre7"),
    v1_13_PRE6(388, 1512, true, v1_13, "1.13-pre6"),
    v1_13_PRE5(387, 1511, true, v1_13, "1.13-pre5"),
    v1_13_PRE4(386, 1504, true, v1_13, "1.13-pre4"),
    v1_13_PRE3(385, 1503, true, v1_13, "1.13-pre3"),
    v1_13_PRE2(384, 1502, true, v1_13, "1.13-pre2"),
    v1_13_PRE1(383, 1501, true, v1_13, "1.13-pre1"),
    SNAPSHOT_18W22C(382, 1499, true, v1_13, "18w22c"),
    SNAPSHOT_18W22B(381, 1498, true, v1_13, "18w22b"),
    SNAPSHOT_18W22A(380, 1497, true, v1_13, "18w22a"),
    SNAPSHOT_18W21B(379, 1496, true, v1_13, "18w21b"),
    SNAPSHOT_18W21A(379, 1495, true, v1_13, "18w21a"),
    SNAPSHOT_18W20C(377, 1493, true, v1_13, "18w20c"),
    SNAPSHOT_18W20B(376, 1491, true, v1_13, "18w20b"),
    SNAPSHOT_18W20A(375, 1489, true, v1_13, "18w20a"),
    SNAPSHOT_18W19B(374, 1485, true, v1_13, "18w19b"),
    SNAPSHOT_18W19A(373, 1484, true, v1_13, "18w19a"),
    SNAPSHOT_18W16A(372, 1483, true, v1_13, "18w16a"),
    SNAPSHOT_18W15A(371, 1482, true, v1_13, "18w15a"),
    SNAPSHOT_18W14B(370, 1481, true, v1_13, "18w14b"),
    SNAPSHOT_18W14A(369, 1479, true, v1_13, "18w14a"),
    SNAPSHOT_18W11A(368, 1478, true, v1_13, "18w11a"),
    SNAPSHOT_18W10D(367, 1477, true, v1_13, "18w10d"),
    SNAPSHOT_18W10C(366, 1476, true, v1_13, "18w10c"),
    SNAPSHOT_18W10B(365, 1474, true, v1_13, "18w10b"),
    SNAPSHOT_18W10A(364, 1473, true, v1_13, "18w10a"),
    SNAPSHOT_18W09A(363, 1472, true, v1_13, "18w09a"),
    SNAPSHOT_18W08B(362, 1471, true, v1_13, "18w08b"),
    SNAPSHOT_18W08A(361, 1470, true, v1_13, "18w08a"),
    SNAPSHOT_18W07C(360, 1469, true, v1_13, "18w07c"),
    SNAPSHOT_18W07B(359, 1468, true, v1_13, "18w07b"),
    SNAPSHOT_18W07A(358, 1467, true, v1_13, "18w07a"),
    SNAPSHOT_18W06A(357, 1466, true, v1_13, "18w06a"),
    SNAPSHOT_18W05A(356, 1464, true, v1_13, "18w05a"),
    SNAPSHOT_18W03B(355, 1463, true, v1_13, "18w03b"),
    SNAPSHOT_18W03A(354, 1462, true, v1_13, "18w03a"),
    SNAPSHOT_18W02A(353, 1461, true, v1_13, "18w02a"), // flattened entity IDs (https://pokechu22.github.io/Burger/diff_18w01a_18w02a.html#entities)
    SNAPSHOT_18W01A(352, 1459, true, v1_13, "18w01a"),
    SNAPSHOT_17W50A(351, 1457, true, v1_13, "17w50a"),
    SNAPSHOT_17W49B(350, 1455, true, v1_13, "17w49b"),
    SNAPSHOT_17W49A(349, 1454, true, v1_13, "17w49a"),
    SNAPSHOT_17W48A(348, 1453, true, v1_13, "17w48a"),
    SNAPSHOT_17W47B(347, 1452, true, v1_13, "17w47b"),
    SNAPSHOT_17W47A(346, 1451, true, v1_13, "17w47a"), // flattening update!
    SNAPSHOT_17W46A(345, 1449, v1_13, "17w46a"),
    SNAPSHOT_17W45B(344, 1448, v1_13, "17w45b"),
    SNAPSHOT_17W45A(343, 1447, v1_13, "17w45a"),
    SNAPSHOT_17W43B(342, 1445, v1_13, "17w43b"),
    SNAPSHOT_17W43A(341, 1444, v1_13, "17w43a"),
    v1_12_2(340, 1343, null, "1.12.2"),
    v1_12_2_PRE2(339, 1342, v1_12_2, "1.12.2-pre2"),
    v1_12_2_PRE1(339, 1341, v1_12_2, "1.12.2-pre1"),
    v1_12_1(338, 1241, null, "1.12.1"),
    v1_12_1_PRE1(337, 1240, v1_12_1, "1.12.1-pre1"),
    SNAPSHOT_17W31A(336, 1239, v1_12_1, "17w31a"),
    v1_12(335, 1139, null, "1.12"),
    v1_12_PRE7(334, 1138, v1_12, "1.12-pre7"),
    v1_12_PRE6(333, 1137, v1_12, "1.12-pre6"),
    v1_12_PRE5(332, 1136, v1_12, "1.12-pre5"),
    v1_12_PRE4(331, 1135, v1_12, "1.12-pre4"),
    v1_12_PRE3(330, 1134, v1_12, "1.12-pre3"),
    v1_12_PRE2(329, 1133, v1_12, "1.12-pre2"),
    v1_12_PRE1(328, 1132, v1_12, "1.12-pre1"),
    SNAPSHOT_17W18B(327, 1131, v1_12, "17w18b"),
    SNAPSHOT_17W18A(326, 1130, v1_12, "17w18a"),
    SNAPSHOT_17W17B(325, 1129, v1_12, "17w17b"),
    SNAPSHOT_17W17A(324, 1128, v1_12, "17w17a"),
    SNAPSHOT_17W16B(323, 1127, v1_12, "17w16b"),
    SNAPSHOT_17W16A(322, 1126, v1_12, "17w16a"),
    SNAPSHOT_17W15A(321, 1125, v1_12, "17w15a"),
    SNAPSHOT_17W14A(320, 1124, v1_12, "17w14a"),
    SNAPSHOT_17W13B(319, 1123, v1_12, "17w13b"),
    SNAPSHOT_17W13A(318, 1122, v1_12, "17w13a"),
    SNAPSHOT_17W06A(317, 1022, v1_12, "17w06a"),
    v1_11_2(316, 922, null, "1.11.2"),
    v1_11_1(316, 921, null, "1.11.1"),
    SNAPSHOT_16W50A(316, 920, v1_11_1, "16w50a"),
    v1_11(315, 819, null, "1.11"),
    v1_11_PRE1(314, 818, v1_11, "1.11-pre1"),
    SNAPSHOT_16W44A(313, 817, v1_11, "16w44a"),
    SNAPSHOT_16W43A(313, 816, v1_11, "16w43a"),
    SNAPSHOT_16W42A(312, 815, v1_11, "16w42a"),
    SNAPSHOT_16W41A(311, 814, v1_11, "16w41a"),
    SNAPSHOT_16W40A(310, 813, v1_11, "16w40a"),
    SNAPSHOT_16W39C(309, 812, v1_11, "16w39c"),
    SNAPSHOT_16W39B(308, 811, v1_11, "16w39b"),
    SNAPSHOT_16W39A(307, 809, v1_11, "16w39a"),
    SNAPSHOT_16W38A(306, 807, v1_11, "16w38a"),
    SNAPSHOT_16W36A(305, 805, v1_11, "16w36a"),
    SNAPSHOT_16W35A(304, 803, v1_11, "16w35a"),
    SNAPSHOT_16W33A(303, 803, v1_11, "16w33a"),
    SNAPSHOT_16W32B(302, 801, v1_11, "16w32b"),
    SNAPSHOT_16W32A(301, 800, v1_11, "16w32a"),
    v1_10_2(210, 512, null, "1.10.2"),
    v1_10_1(210, 511, null, "1.10.1"),
    v1_10(210, 510, null, "1.10"),
    v1_10_PRE2(205, 507, v1_10, "1.10-pre2"),
    v1_10_PRE1(204, 506, v1_10, "1.10-pre1"),
    SNAPSHOT_16W21B(203, 504, v1_10, "16w21b"),
    SNAPSHOT_16W21A(202, 503, v1_10, "16w21a"),
    SNAPSHOT_16W20A(201, 501, v1_10, "16w20a"),
    v1_9_4(110, 184, null, "1.9.4"),
    v1_9_3(110, 183, null, "1.9.3"),
    v1_9_3_PRE3(110, 182, v1_9_3, "1.9.3-pre3"),
    v1_9_3_PRE2(110, 181, v1_9_3, "1.9.3-pre2"),
    v1_9_3_PRE1(109, 180, v1_9_3, "1.9.3-pre1"),
    SNAPSHOT_16W15B(109, 179, v1_9_3, "16w15b"),
    SNAPSHOT_16W15A(109, 178, v1_9_3, "16w15a"),
    SNAPSHOT_16W14A(109, 177, v1_9_3, "16w14a"),
    v1_9_2(109, 176, null, "1.9.2"),
    v1_RV_PRE1(108, 173, false, null, true, "1.RV-pre1"), // april fool
    v1_9_1(108, 175, null, "1.9.1"),
    v1_9_1_PRE3(108, 172, v1_9_1, "1.9.1-pre3"),
    v1_9_1_PRE2(108, 171, v1_9_1, "1.9.1-pre2"),
    v1_9_1_PRE1(107, 170, v1_9_1, "1.9.1-pre1"),
    v1_9           (107, 169, null, "1.9"),
    v1_9_PRE4      (106, 168, v1_9, "1.9-pre4"),
    v1_9_PRE3      (105, 167, v1_9, "1.9-pre3"),
    v1_9_PRE2      (104, 165, v1_9, "1.9-pre2"),
    v1_9_PRE1      (103, 164, v1_9, "1.9-pre1"),
    SNAPSHOT_16W07B(102, 163, v1_9, "16w07b"),
    SNAPSHOT_16W07A(101, 162, v1_9, "16w07a"),
    SNAPSHOT_16W06A(100, 161, v1_9, "16w06a"),
    SNAPSHOT_16W05B(99,  160, v1_9, "16w05b"),
    SNAPSHOT_16W05A(98,  159, v1_9, "16w05a"),
    SNAPSHOT_16W04A(97,  158, v1_9, "16w04a"),
    SNAPSHOT_16W03A(96,  157, v1_9, "16w03a"),
    SNAPSHOT_16W02A(95,  156, v1_9, "16w02a"),
    SNAPSHOT_15W51B(94,  155, v1_9, "15w51b"),
    SNAPSHOT_15W51A(93,  154, v1_9, "15w51a"),
    SNAPSHOT_15W50A(92,  153, v1_9, "15w50a"),
    SNAPSHOT_15W49B(91,  152, v1_9, "15w49b"),
    SNAPSHOT_15W49A(90,  151, v1_9, "15w49a"),
    SNAPSHOT_15W47C(89,  150, v1_9, "15w47c"),
    SNAPSHOT_15W47B(88,  149, v1_9, "15w47b"),
    SNAPSHOT_15W47A(87,  148, v1_9, "15w47a"),
    SNAPSHOT_15W46A(86,  146, v1_9, "15w46a"),
    SNAPSHOT_15W45A(85,  145, v1_9, "15w45a"),
    SNAPSHOT_15W44B(84,  143, v1_9, "15w44b"),
    SNAPSHOT_15W44A(83,  142, v1_9, "15w44a"),
    SNAPSHOT_15W43C(82,  141, v1_9, "15w43c"),
    SNAPSHOT_15W43B(81,  140, v1_9, "15w43b"),
    SNAPSHOT_15W43A(80,  139, v1_9, "15w43a"),
    SNAPSHOT_15W42A(79,  138, v1_9, "15w42a"),
    SNAPSHOT_15W41B(78,  137, v1_9, "15w41b"),
    SNAPSHOT_15W41A(77,  136, v1_9, "15w41a"),
    SNAPSHOT_15W40B(76,  134, v1_9, "15w40b"),
    SNAPSHOT_15W40A(75,  133, v1_9, "15w40a"),
    SNAPSHOT_15W39C(74,  132, v1_9, "15w39c"),
    SNAPSHOT_15W39B(74,  131, v1_9, "15w39b"),
    SNAPSHOT_15W39A(74,  130, v1_9, "15w39a"),
    SNAPSHOT_15W38B(73,  129, v1_9, "15w38b"),
    SNAPSHOT_15W38A(72,  128, v1_9, "15w38a"),
    SNAPSHOT_15W37A(71,  127, v1_9, "15w37a"),
    SNAPSHOT_15W36D(70,  126, v1_9, "15w36d"),
    SNAPSHOT_15W36C(69,  125, v1_9, "15w36c"),
    SNAPSHOT_15W36B(68,  124, v1_9, "15w36b"),
    SNAPSHOT_15W36A(67,  123, v1_9, "15w36a"),
    SNAPSHOT_15W35E(66,  122, v1_9, "15w35e"),
    SNAPSHOT_15W35D(65,  121, v1_9, "15w35d"),
    SNAPSHOT_15W35C(64,  120, v1_9, "15w35c"),
    SNAPSHOT_15W35B(63,  119, v1_9, "15w35b"),
    SNAPSHOT_15W35A(62,  118, v1_9, "15w35a"),
    SNAPSHOT_15W34D(61,  117, v1_9, "16w34d"),
    SNAPSHOT_15W34C(60,  116, v1_9, "15w34c"),
    SNAPSHOT_15W34B(59,  115, v1_9, "15w34b"),
    SNAPSHOT_15W34A(58,  114, v1_9, "15w34a"),
    SNAPSHOT_15W33C(57,  112, v1_9, "15w33c"),
    SNAPSHOT_15W33B(56,  111, v1_9, "15w33b"),
    SNAPSHOT_15W33A(55,  111, v1_9, "15w33a"),
    SNAPSHOT_15W32C(54,  104, v1_9, "15w32c"),
    SNAPSHOT_15W32B(53,  103, v1_9, "15w32b"),
    SNAPSHOT_15W32A(52,  100, v1_9, "15w32a"),
    SNAPSHOT_15W31C(51,                 v1_9, "15w31c"),
    SNAPSHOT_15W31B(50,                 v1_9, "15w31b"),
    SNAPSHOT_15W31A(49,                 v1_9, "15w31a"),

    SNAPSHOT_15W14A(48, -1, false, null, true, "15w14a"), // april fools

    v1_8_9     (47,         "1.8.9"),
    v1_8_8     (47,         "1.8.8"),
    v1_8_7     (47,         "1.8.7"),
    v1_8_6     (47,         "1.8.6"),
    v1_8_5     (47,         "1.8.5"),
    v1_8_4     (47,         "1.8.4"),
    v1_8_3     (47,         "1.8.3"),
    v1_8_2     (47,         "1.8.2"),
    v1_8_2_PRE7(47, v1_8_2, "1.8.2-pre7"),
    v1_8_2_PRE6(47, v1_8_2, "1.8.2-pre6"),
    v1_8_2_PRE5(47, v1_8_2, "1.8.2-pre5"),
    v1_8_2_PRE4(47, v1_8_2, "1.8.2-pre4"),
    v1_8_2_PRE3(47, v1_8_2, "1.8.2-pre3"),
    v1_8_2_PRE2(47, v1_8_2, "1.8.2-pre2"),
    v1_8_2_PRE1(47, v1_8_2, "1.8.2-pre1"),
    v1_8_1     (47,         "1.8.1"),
    v1_8_1_PRE5(47, v1_8_1, "1.8.1-pre5"),
    v1_8_1_PRE4(47, v1_8_1, "1.8.1-pre4"),
    v1_8_1_PRE3(47, v1_8_1, "1.8.1-pre3"),
    v1_8_1_PRE2(47, v1_8_1, "1.8.1-pre2"),
    v1_8_1_PRE1(47, v1_8_1, "1.8.1-pre1"),

    v1_8           (47,       "1.8"),
    v1_8_PRE3      (46, v1_8, "1.8-pre3"),
    v1_8_PRE2      (45, v1_8, "1.8-pre2"),
    v1_8_PRE1      (44, v1_8, "1.8-pre1"),
    SNAPSHOT_14W34D(43, v1_8, "14w34d"),
    SNAPSHOT_14W34C(42, v1_8, "14w34c"),
    SNAPSHOT_14W34B(41, v1_8, "14w34b"),
    SNAPSHOT_14W34A(40, v1_8, "14w34a"),
    SNAPSHOT_14W33C(39, v1_8, "14w33c"),
    SNAPSHOT_14W33B(38, v1_8, "14w33b"),
    SNAPSHOT_14W33A(37, v1_8, "14w33a"),
    SNAPSHOT_14W32D(36, v1_8, "14w32d"),
    SNAPSHOT_14W32C(35, v1_8, "14w32c"),
    SNAPSHOT_14W32B(34, v1_8, "14w32b"),
    SNAPSHOT_14W32A(33, v1_8, "14w32a"),
    SNAPSHOT_14W31A(32, v1_8, "14w31a"),
    SNAPSHOT_14W30C(31, v1_8, "14w30c"),
    SNAPSHOT_14W30B(30, v1_8, "14w30b"),
    SNAPSHOT_14W30A(30, v1_8, "14w30a"),
    SNAPSHOT_14W29B(29, v1_8, "14w29b"),
    SNAPSHOT_14W29A(29, v1_8, "14w29a"),
    SNAPSHOT_14W28B(28, v1_8, "14w28b"),
    SNAPSHOT_14W28A(27, v1_8, "14w28a"),
    SNAPSHOT_14W27B(26, v1_8, "14w27b"),
    SNAPSHOT_14W27A(26, v1_8, "14w27a"),
    SNAPSHOT_14W26C(25, v1_8, "14w26c"),
    SNAPSHOT_14W26B(24, v1_8, "14w26b"),
    SNAPSHOT_14W26A(23, v1_8, "14w26a"),
    SNAPSHOT_14W25B(22, v1_8, "14w25b"),
    SNAPSHOT_14W25A(21, v1_8, "14w25a"),
    SNAPSHOT_14W21B(20, v1_8, "14w21b"),
    SNAPSHOT_14W21A(19, v1_8, "14w21a"),
    SNAPSHOT_14W20B(18, v1_8, "14w20b"),
    SNAPSHOT_14W20A(18, v1_8, "14w20a"),
    SNAPSHOT_14W19A(17, v1_8, "14w19a"),
    SNAPSHOT_14W18B(16, v1_8, "14w18b"),
    SNAPSHOT_14W18A(16, v1_8, "14w18a"),
    SNAPSHOT_14W17A(15, v1_8, "14w17a"),
    SNAPSHOT_14W11A(14, v1_8, "14w11a"),
    SNAPSHOT_14W10C(13, v1_8, "14w10c"),
    SNAPSHOT_14W10B(13, v1_8, "14w10b"),
    SNAPSHOT_14W10A(13, v1_8, "14w10a"),
    SNAPSHOT_14W08A(12, v1_8, "14w08a"),
    SNAPSHOT_14W07A(11, v1_8, "14w07a"),
    SNAPSHOT_14W06B(10, v1_8, "14w06b"),
    SNAPSHOT_14W06A(10, v1_8, "14w06a"),
    SNAPSHOT_14W05B(9,  v1_8,   "14w05b"),
    SNAPSHOT_14W05A(9,  v1_8,   "14w05a"),
    SNAPSHOT_14W04B(8,  v1_8,   "14w04b"),
    SNAPSHOT_14W04A(7,  v1_8,   "14w04a"),
    SNAPSHOT_14W03B(6,  v1_8,   "14w03b"),
    SNAPSHOT_14W03A(6,  v1_8,   "14w03a"),
    SNAPSHOT_14W02C(5,  v1_8,   "14w02c"),
    SNAPSHOT_14W02B(5,  v1_8,   "14w02b"),
    SNAPSHOT_14W02A(5,  v1_8,   "14w02a"),

    v1_7_10        (5,         "1.7.10"),
    v1_7_10_PRE4   (5, v1_7_10,"1.7.10-pre4"),
    v1_7_10_PRE3   (5, v1_7_10,"1.7.10-pre3"),
    v1_7_10_PRE2   (5, v1_7_10,"1.7.10-pre2"),
    v1_7_10_PRE1   (5, v1_7_10,"1.7.10-pre1"),
    v1_7_9         (5,         "1.7.9"),
    v1_7_8         (5,         "1.7.8"),
    v1_7_7         (5,         "1.7.7"),
    v1_7_6         (5,         "1.7.6"),
    v1_7_6_PRE2    (5, v1_7_6, "1.7.6-pre2"),
    v1_7_6_PRE1    (5, v1_7_6, "1.7.6-pre1"),
    v1_7_5         (4,         "1.7.5"),
    v1_7_4         (4,         "1.7.4"),
    v1_7_3         (4,         "1.7.3"),
    SNAPSHOT_13W49A(4, v1_7_3, "13w49a"),
    SNAPSHOT_13W48B(4, v1_7_3, "13w48b"),
    SNAPSHOT_13W48A(4, v1_7_3, "13w48a"),
    SNAPSHOT_13W47E(4, v1_7_3, "13w47e"),
    SNAPSHOT_13W47D(4, v1_7_3, "13w47d"),
    SNAPSHOT_13W47C(4, v1_7_3, "13w47c"),
    SNAPSHOT_13W47B(4, v1_7_3, "13w47b"),
    SNAPSHOT_13W47A(4, v1_7_3, "13w47a"),
    v1_7_2         (4,         "1.7.2"),
    v1_7_1         (3,         "1.7.1"),
    v1_7           (3,         "1.7"),
    SNAPSHOT_13W43A(2, v1_7,   "13w43a"),
    SNAPSHOT_13W42B(1, v1_7,   "13w42b"),
    SNAPSHOT_13W42A(1, v1_7,   "13w42a"),
    SNAPSHOT_13W41B(0, v1_7,   "13w41b"),
    SNAPSHOT_13W41A(0, v1_7,   "13w41a"),

    @IgnoreTest("dummy version")
    UNKNOWN(-1, "unknown"),

    /* pre-netty rewrite */
    /* // nuke pre-netty rewrite
    SNAPSHOT_13W39B(80, v1_7, "13w39b"),
    SNAPSHOT_13W39A(80, v1_7, "13w39a"),
    SNAPSHOT_13W38C(79, v1_7, "13w38c"),
    SNAPSHOT_13W38B(79, v1_7, "13w38b"),
    SNAPSHOT_13W38A(79, v1_7, "13w38a"),
    v1_6_4(78, "1.6.4"),
    v1_6_3(77, "1.6.3"),
    SNAPSHOT_13W37B(76, v1_6_3, "13w37b"),
    SNAPSHOT_13W37A(76, v1_6_3, "13w37a"),
    SNAPSHOT_13W36B(75, v1_6_3, "13w36b"),
    SNAPSHOT_13W36A(75, v1_6_3, "13w36a"),
    v1_6_2(74, "1.6.2"),
    v1_6_1(73, "1.6.1"),
    v1_6(72, "1.6"),
    SNAPSHOT_13W26A(72, v1_6, "13w26a"),
    SNAPSHOT_13W25C(71, v1_6, "13w25c"),
    SNAPSHOT_13W25B(71, v1_6, "13w25b"),
    SNAPSHOT_13W25A(71, v1_6, "13w25a"),
    SNAPSHOT_13W24B(70, v1_6, "13w24b"),
    SNAPSHOT_13W24A(69, v1_6, "13w24a"),
    SNAPSHOT_13W23B(68, v1_6, "13w23b"),
    SNAPSHOT_13W23A(67, v1_6, "13w23a"),
    SNAPSHOT_13W22A(67, v1_6, "13w22a"),
    SNAPSHOT_13W21B(67, v1_6, "13w21b"),
    SNAPSHOT_13W21A(67, v1_6, "13w21a"),
    SNAPSHOT_13W19A(66, v1_6, "13w19a"),
    SNAPSHOT_13W18C(65, v1_6, "13w18c"),
    SNAPSHOT_13W18B(65, v1_6, "13w18b"),
    SNAPSHOT_13W18A(65, v1_6, "13w18a"),
    SNAPSHOT_13W17A(64, v1_6, "13w17a"),
    SNAPSHOT_13W16B(63, v1_6, "13w16b"),
    SNAPSHOT_13W16A(62, v1_6, "13w16a"),
    v1_5_2(61, "1.5.2"),
    v2_0_BLUE(90, -1, false, null, true, "2.0 Blue"), // april fools
    v2_0_RED(91, -1, false, null, true, "2.0 Red"), // april fools
    v2_0_PURPLE(92, -1, false, null, true, "2.0 Purple"), // april fools
    v1_5_1(60, "1.5.1"),
    SNAPSHOT_13W12(60, v1_5_1, "13w12~"),
    SNAPSHOT_13W11A(60, v1_5_1, "13w11a"),
    v1_5(60, "1.5"),
    SNAPSHOT_13W10B(60, v1_5, "13w10b"),
    SNAPSHOT_13W10A(60, v1_5, "13w10a"),
    SNAPSHOT_13W09C(60, v1_5, "13w09c"),
    SNAPSHOT_13W09B(59, v1_5, "13w09b"),
    SNAPSHOT_13W09A(59, v1_5, "13w09a"),
    SNAPSHOT_13W07A(58, v1_5, "13w07a"),
    SNAPSHOT_13W06A(58, v1_5, "13w06a"),
    SNAPSHOT_13W05B(57, v1_5, "13w05b"),
    SNAPSHOT_13W05A(56, v1_5, "13w05a"),
    SNAPSHOT_13W04A(55, v1_5, "13w04a"),
    SNAPSHOT_13W03A(54, v1_5, "13w03a"),
    SNAPSHOT_13W02B(53, v1_5, "13w02b"),
    SNAPSHOT_13W02A(53, v1_5, "13w02a"),
    SNAPSHOT_13W01B(52, v1_5, "13w01b"),
    SNAPSHOT_13W01A(52, v1_5, "13w01a"),
    v1_4_7(51, "1.4.7"),
    v1_4_6(51, "1.4.6"),
    SNAPSHOT_12W50B(51, v1_4_6, "12w50b"),
    SNAPSHOT_12W50A(51, v1_4_6, "12w50a"),
    SNAPSHOT_12W49A(50, v1_4_6, "12w49a"),
    v1_4_5(49, "1.4.5"),
    v1_4_4(49, "1.4.4"),
    v1_4_3(48, "1.4.3"),
    v1_4_2(47, "1.4.2"),
    v1_4_1(-1, "1.4.1"), // unknown
    v1_4(-1, "1.4"), // unknown
    SNAPSHOT_12W42B(46, v1_4, "12w42b"),
    SNAPSHOT_12W42A(46, v1_4, "12w42a"),
    SNAPSHOT_12W41B(46, v1_4, "12w41b"),
    SNAPSHOT_12W41A(46, v1_4, "12w41a"),
    SNAPSHOT_12W40B(45, v1_4, "12w40b"),
    SNAPSHOT_12W40A(44, v1_4, "12w40a"),
    SNAPSHOT_12W39B(43, v1_4, "12w39b"),
    SNAPSHOT_12W39A(43, v1_4, "12w39a"),
    SNAPSHOT_12W38B(43, v1_4, "12w38b"),
    SNAPSHOT_12W38A(43, v1_4, "12w38a"),
    SNAPSHOT_12W37A(42, v1_4, "12w37a"),
    SNAPSHOT_12W36A(42, v1_4, "12w36a"),
    SNAPSHOT_12W34B(42, v1_4, "12w34b"),
    SNAPSHOT_12W34A(41, v1_4, "12w34a"),
    SNAPSHOT_12W32A(40, v1_4, "12w32a"),
    v1_3_2(39, "1.3.2"),
    v1_3_1(39, "1.3.1"),
    v1_3(39, "1.3"),
    SNAPSHOT_12W30E(39, v1_3, "12w30e"),
    SNAPSHOT_12W30D(39, v1_3, "12w30d"),
    SNAPSHOT_12W30C(39, v1_3, "12w30c"),
    SNAPSHOT_12W30B(38, v1_3, "12w30b"),
    SNAPSHOT_12W30A(38, v1_3, "12w30a"),
    SNAPSHOT_12W27A(38, v1_3, "12w27a"),
    SNAPSHOT_12W26A(37, v1_3, "12w26a"),
    SNAPSHOT_12W25A(37, v1_3, "12w25a"),
    SNAPSHOT_12W24A(36, v1_3, "12w24a"),
    SNAPSHOT_12W23B(35, v1_3, "12w23b"),
    SNAPSHOT_12W23A(35, v1_3, "12w23a"),
    SNAPSHOT_12W22A(34, v1_3, "12w22a"),
    SNAPSHOT_12W21B(33, v1_3, "12w21b"),
    SNAPSHOT_12W21A(33, v1_3, "12w21a"),
    SNAPSHOT_12W19A(32, v1_3, "12w19a"),
    SNAPSHOT_12W18A(32, v1_3, "12w18a"),
    SNAPSHOT_12W17A(31, v1_3, "12w17a"),
    SNAPSHOT_12W16A(30, v1_3, "12w16a"),
    SNAPSHOT_12W15A(29, v1_3, "12w15a"),
    v1_2_5(29, "1.2.5"),
    v1_2_4(29, "1.2.4"),
    v1_2_3(28, "1.2.3"),
    v1_2_2(28, "1.2.2"),
    v1_2_1(28, "1.2.1"),
    v1_2(28, "1.2"),
    SNAPSHOT_12W08A(28, v1_2, "12w08a"),
    SNAPSHOT_12W07B(27, v1_2, "12w07b"),
    SNAPSHOT_12W07A(27, v1_2, "12w07a"),
    SNAPSHOT_12W06A(25, v1_2, "12w06a"),
    SNAPSHOT_12W05B(24, v1_2, "12w05b"),
    SNAPSHOT_12W05A(24, v1_2, "12w05a"),
    SNAPSHOT_12W04A(24, v1_2, "12w04a"),
    SNAPSHOT_12W03A(24, v1_2, "12w03a"),
    v1_1(23, "1.1"),
    SNAPSHOT_12W01A(23, "12w01a"),
    SNAPSHOT_11W50A(22, "11w50a"),
    SNAPSHOT_11W49A(22, "11w49a"),
    SNAPSHOT_11W48A(22, "11w48a"),
    SNAPSHOT_11W47A(22, "11w47a"),
    v1_0_1(22, "1.0.1"),
    v1_0_0(22, "1.0.0"),
    RC2(22, v1_0_0, "RC2"),
    RC1(22, v1_0_0, "RC1"),
    BETA_1_9_PRE6(22, v1_0_0, "Beta 1.9-pre6"),
    BETA_1_9_PRE5(21, v1_0_0, "Beta 1.9-pre5"),
    BETA_1_9_PRE4(20, v1_0_0, "Beta 1.9-pre4"),
    BETA_1_9_PRE3(19, v1_0_0, "Beta 1.9-pre3"),
    BETA_1_9_PRE2(19, v1_0_0, "Beta 1.9-pre2"),
    BETA_1_9_PRE(18, v1_0_0, "Beta 1.9-pre"),
    BETA_1_8_1(17, "Beta 1.8.1"),
    BETA_1_8(17, "Beta 1.8"),
    BETA_1_8_PRE2(16, BETA_1_8, "Beta 1.8-pre2"),
    BETA_1_8_PRE(15, BETA_1_8, "Beta 1.8-pre"),
    BETA_1_7_3(14, "Beta 1.7.3"),
    BETA_1_7_2(14, "Beta 1.7.2"),
    BETA_1_7_01(14, "Beta 1.7_01"),
    BETA_1_7(14, "Beta 1.7"),
    BETA_1_6_6(13, "Beta 1.6.6"),
    BETA_1_6_5(13, "Beta 1.6.5"),
    BETA_1_6_4(13, "Beta 1.6.4"),
    BETA_1_6_3(13, "Beta 1.6.3"),
    BETA_1_6_2(13, "Beta 1.6.2"),
    BETA_1_6_1(13, "Beta 1.6.1"),
    BETA_1_6(13, "Beta 1.6"),
    BETA_1_6_TEST_BUILD_3(12, "Beta 1.6 Test Build 3"),
    BETA_1_5_02(11, "Beta 1.5_02"),
    BETA_1_5_01(11, "Beta 1.5_01"),
    BETA_1_5(11, "Beta 1.5"),
    BETA_1_4_01(10, "Beta 1.4_01"),
    BETA_1_4(10, "Beta 1.4"),
    BETA_1_3_01(9, "Beta 1.3_01"),
    BETA_1_3(9, "Beta 1.3"),
    BETA_1_2_02(8, "Beta 1.2_02"),
    BETA_1_2_01(8, "Beta 1.2_01"),
    BETA_1_2(8, "Beta 1.2"),
    BETA_1_1_02(8, "Beta 1.1_02"),
    BETA_1_1_01(7, "Beta 1.1_01"),
    BETA_1_1(7, "Beta 1.1"),
    BETA_1_0_2(7, "Beta 1.0.2"),
    BETA_1_0_01(7, "Beta 1.0_01"),
    BETA_1_0(7, "Beta 1.0"),*/
    ;

    private final int protocolVersion;
    private final int dataVersion;
    private final boolean modern;
    private final boolean releaseCandidate;
    private final boolean prerelease;
    private final boolean snapshot;
    private final MCVersion snapshotFor;
    private final boolean aprilFools;
    private final boolean beta;
    private final String name;

    MCVersion(int protocolVersion, @NotNull String name) {
        this(protocolVersion, -1, false, name);
    }

    MCVersion(int protocolVersion, int dataVersion, @Nullable MCVersion snapshotFor, @NotNull String name) {
        this(protocolVersion, dataVersion, false, snapshotFor, name);
    }

    MCVersion(int protocolVersion, int dataVersion, boolean modern, @NotNull String name) {
        this(protocolVersion, dataVersion, modern, null, name);
    }

    MCVersion(int protocolVersion, int dataVersion, boolean modern, @Nullable MCVersion snapshotFor, @NotNull String name) {
        this(protocolVersion, dataVersion, modern, snapshotFor, false, name);
    }

    MCVersion(int protocolVersion, int dataVersion, boolean modern, @Nullable MCVersion snapshotFor, boolean aprilFools, @NotNull String name) {
        if (name().equalsIgnoreCase("snapshot")) throw new IllegalArgumentException("This name is not allowed: " + name() + " (" + name + ")");
        this.protocolVersion = protocolVersion;
        this.dataVersion = dataVersion;
        this.modern = modern;
        this.releaseCandidate = name().contains("RC");
        this.prerelease = name().contains("PRE");
        this.snapshot = name().startsWith("SNAPSHOT_");
        this.aprilFools = aprilFools;
        this.beta = name().contains("BETA");
        this.name = name;
        if (snapshotFor != null && !snapshot && !prerelease && !releaseCandidate) throw new IllegalArgumentException("Cannot set snapshotFor parameter to non-snapshot version");
        this.snapshotFor = snapshotFor;
    }

    MCVersion(int protocolVersion, @Nullable MCVersion snapshotFor, @NotNull String name) {
        this(protocolVersion, -1, snapshotFor, name);
    }

    /**
     * @return protocol version for this version.
     */
    public int getProtocolVersion() {
        return protocolVersion;
    }

    /**
     * Returns if it's pre-release or not
     * @return true if it's pre-release version
     */
    public boolean isPrerelease() {
        return prerelease;
    }

    /**
     * Returns if it's release candidate version or not
     * @return true if it's release candidate
     */
    public boolean isReleaseCandidate() {
        return releaseCandidate;
    }

    /**
     * Returns if it's modern version(it means 1.13+ in common) or not
     * @return true if this version is modern
     */
    public boolean isModern() { return modern; }

    /**
     * Returns if it's snapshot or not
     * @return true if this version is snapshot
     */
    public boolean isSnapshot() { return snapshot; }

    /**
     * @return the version name
     */
    @NotNull
    public String getName() {
        return name;
    }

    /**
     * Returns what this snapshot(pre-release) was made for
     * @return MCVersion if this version is snapshot or pre-release and snapshotFor was defined, null otherwise
     */
    @Nullable
    public MCVersion getSnapshotFor() {
        return snapshotFor;
    }

    /**
     * Returns a data version, also known as a world version,
     * is a positive integer used in world save data
     * to denote a specific version.<br />
     * It returns -1 if the version does not have data version.
     * @return data version, -1 if the version does not support data version
     */
    public int getDataVersion() {
        return dataVersion;
    }

    /**
     * @return true if this version is april fools
     */
    public boolean isAprilFools() {
        return aprilFools;
    }

    /**
     * @return true if this version is beta
     */
    public boolean isBeta() {
        return beta;
    }

    private static final Map<Integer, List<MCVersion>> cachedProtocolVersions = new HashMap<>();
    private static final Map<Integer, List<MCVersion>> cachedDataVersions = new HashMap<>();

    @NotNull
    public static List<MCVersion> getByProtocolVersion(int protocolVersion) {
        if (cachedProtocolVersions.containsKey(protocolVersion)) return cachedProtocolVersions.get(protocolVersion);
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.protocolVersion == protocolVersion) list.add(version);
        }
        if (list.size() == 0) list.add(UNKNOWN);
        cachedProtocolVersions.put(protocolVersion, list);
        return list;
    }

    @NotNull
    public static List<MCVersion> getByDataVersion(int dataVersion) {
        if (cachedDataVersions.containsKey(dataVersion)) return cachedDataVersions.get(dataVersion);
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.dataVersion == dataVersion) list.add(version);
        }
        if (list.size() == 0) list.add(UNKNOWN);
        cachedDataVersions.put(dataVersion, list);
        return list;
    }

    @NotNull
    public static List<MCVersion> getAprilFoolsVersions() {
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.aprilFools) list.add(version);
        }
        return list;
    }

    @NotNull
    public static List<MCVersion> getPrereleaseVersions() {
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.prerelease) list.add(version);
        }
        return list;
    }

    @NotNull
    public static List<MCVersion> getModernVersions() {
        List<MCVersion> list = new ArrayList<>();
        for (MCVersion version : values()) {
            if (version.modern) list.add(version);
        }
        return list;
    }

    @Override
    public String toString() {
        return "MCVersion{" + "protocolVersion=" + protocolVersion +
                ", dataVersion=" + dataVersion +
                ", modern=" + modern +
                ", releaseCandidate=" + releaseCandidate +
                ", prerelease=" + prerelease +
                ", snapshot=" + snapshot +
                ", snapshotFor=" + snapshotFor +
                ", aprilFools=" + aprilFools +
                ", beta=" + beta +
                ", name='" + name + '\'' +
                '}';
    }
}